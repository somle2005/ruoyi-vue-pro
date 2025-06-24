package com.jd.open.api.sdk.internal.JSON;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class JSONPojoConvertor implements JSON.Convertor {
   private static final Logger LOG = Log.getLogger(JSONPojoConvertor.class);
   public static final Object[] GETTER_ARG = new Object[0];
   public static final Object[] NULL_ARG = new Object[]{null};
   private static final Map<Class<?>, NumberType> __numberTypes = new HashMap();
   protected boolean _fromJSON;
   protected Class<?> _pojoClass;
   protected Map<String, Method> _getters;
   protected Map<String, Setter> _setters;
   protected Set<String> _excluded;
   public static final NumberType SHORT = new NumberType() {
      public Object getActualValue(Number number) {
         return new Short(number.shortValue());
      }
   };
   public static final NumberType INTEGER = new NumberType() {
      public Object getActualValue(Number number) {
         return new Integer(number.intValue());
      }
   };
   public static final NumberType FLOAT = new NumberType() {
      public Object getActualValue(Number number) {
         return new Float(number.floatValue());
      }
   };
   public static final NumberType LONG = new NumberType() {
      public Object getActualValue(Number number) {
         return number instanceof Long ? number : new Long(number.longValue());
      }
   };
   public static final NumberType DOUBLE = new NumberType() {
      public Object getActualValue(Number number) {
         return number instanceof Double ? number : new Double(number.doubleValue());
      }
   };

   public static NumberType getNumberType(Class<?> clazz) {
      return (NumberType)__numberTypes.get(clazz);
   }

   public JSONPojoConvertor(Class<?> pojoClass) {
      this(pojoClass, (Set)null, true);
   }

   public JSONPojoConvertor(Class<?> pojoClass, String[] excluded) {
      this(pojoClass, new HashSet(Arrays.asList(excluded)), true);
   }

   public JSONPojoConvertor(Class<?> pojoClass, Set<String> excluded) {
      this(pojoClass, excluded, true);
   }

   public JSONPojoConvertor(Class<?> pojoClass, Set<String> excluded, boolean fromJSON) {
      this._getters = new HashMap();
      this._setters = new HashMap();
      this._pojoClass = pojoClass;
      this._excluded = excluded;
      this._fromJSON = fromJSON;
      this.init();
   }

   public JSONPojoConvertor(Class<?> pojoClass, boolean fromJSON) {
      this(pojoClass, (Set)null, fromJSON);
   }

   protected void init() {
      Method[] methods = this._pojoClass.getMethods();

      for(int i = 0; i < methods.length; ++i) {
         Method m = methods[i];
         if (!Modifier.isStatic(m.getModifiers()) && m.getDeclaringClass() != Object.class) {
            String name = m.getName();
            switch (m.getParameterTypes().length) {
               case 0:
                  if (m.getReturnType() != null) {
                     if (name.startsWith("is") && name.length() > 2) {
                        name = name.substring(2, 3).toLowerCase() + name.substring(3);
                     } else {
                        if (!name.startsWith("get") || name.length() <= 3) {
                           continue;
                        }

                        name = name.substring(3, 4).toLowerCase() + name.substring(4);
                     }

                     if (this.includeField(name, m)) {
                        this.addGetter(name, m);
                     }
                  }
                  break;
               case 1:
                  if (name.startsWith("set") && name.length() > 3) {
                     name = name.substring(3, 4).toLowerCase() + name.substring(4);
                     if (this.includeField(name, m)) {
                        this.addSetter(name, m);
                     }
                  }
            }
         }
      }

   }

   protected void addGetter(String name, Method method) {
      this._getters.put(name, method);
   }

   protected void addSetter(String name, Method method) {
      this._setters.put(name, new Setter(name, method));
   }

   protected Setter getSetter(String name) {
      return (Setter)this._setters.get(name);
   }

   protected boolean includeField(String name, Method m) {
      return this._excluded == null || !this._excluded.contains(name);
   }

   protected int getExcludedCount() {
      return this._excluded == null ? 0 : this._excluded.size();
   }

   public Object fromJSON(Map object) {
      Object obj = null;

      try {
         obj = this._pojoClass.newInstance();
      } catch (Exception e) {
         throw new RuntimeException(e);
      }

      this.setProps(obj, object);
      return obj;
   }

   public int setProps(Object obj, Map<?, ?> props) {
      int count = 0;

      for(Map.Entry<?, ?> entry : props.entrySet()) {
         Setter setter = this.getSetter((String)entry.getKey());
         if (setter != null) {
            try {
               setter.invoke(obj, entry.getValue());
               ++count;
            } catch (Exception e) {
               LOG.warn(this._pojoClass.getName() + "#" + setter.getPropertyName() + " not set from " + entry.getValue().getClass().getName() + "=" + entry.getValue().toString());
               this.log(e);
            }
         }
      }

      return count;
   }

   public void toJSON(Object obj, JSON.Output out) {
      if (this._fromJSON) {
         out.addClass(this._pojoClass);
      }

      for(Map.Entry<String, Method> entry : this._getters.entrySet()) {
         try {
            out.add((String)entry.getKey(), ((Method)entry.getValue()).invoke(obj, GETTER_ARG));
         } catch (Exception e) {
            LOG.warn("{} property '{}' excluded. (errors)", this._pojoClass.getName(), entry.getKey());
            this.log(e);
         }
      }

   }

   protected void log(Throwable t) {
      LOG.ignore(t);
   }

   static {
      __numberTypes.put(Short.class, SHORT);
      __numberTypes.put(Short.TYPE, SHORT);
      __numberTypes.put(Integer.class, INTEGER);
      __numberTypes.put(Integer.TYPE, INTEGER);
      __numberTypes.put(Long.class, LONG);
      __numberTypes.put(Long.TYPE, LONG);
      __numberTypes.put(Float.class, FLOAT);
      __numberTypes.put(Float.TYPE, FLOAT);
      __numberTypes.put(Double.class, DOUBLE);
      __numberTypes.put(Double.TYPE, DOUBLE);
   }

   public static class Setter {
      protected String _propertyName;
      protected Method _setter;
      protected NumberType _numberType;
      protected Class<?> _type;
      protected Class<?> _componentType;

      public Setter(String propertyName, Method method) {
         this._propertyName = propertyName;
         this._setter = method;
         this._type = method.getParameterTypes()[0];
         this._numberType = (NumberType)JSONPojoConvertor.__numberTypes.get(this._type);
         if (this._numberType == null && this._type.isArray()) {
            this._componentType = this._type.getComponentType();
            this._numberType = (NumberType)JSONPojoConvertor.__numberTypes.get(this._componentType);
         }

      }

      public String getPropertyName() {
         return this._propertyName;
      }

      public Method getMethod() {
         return this._setter;
      }

      public NumberType getNumberType() {
         return this._numberType;
      }

      public Class<?> getType() {
         return this._type;
      }

      public Class<?> getComponentType() {
         return this._componentType;
      }

      public boolean isPropertyNumber() {
         return this._numberType != null;
      }

      public void invoke(Object obj, Object value) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
         if (value == null) {
            this._setter.invoke(obj, JSONPojoConvertor.NULL_ARG);
         } else {
            this.invokeObject(obj, value);
         }

      }

      protected void invokeObject(Object obj, Object value) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
         if (this._type.isEnum()) {
            if (value instanceof Enum) {
               this._setter.invoke(obj, value);
            } else {
               this._setter.invoke(obj, Enum.valueOf((Class<Enum>) this._type, value.toString()));
            }
         } else if (this._numberType != null && value instanceof Number) {
            this._setter.invoke(obj, this._numberType.getActualValue((Number)value));
         } else if (!Character.TYPE.equals(this._type) && !Character.class.equals(this._type)) {
            if (this._componentType != null && value.getClass().isArray()) {
               if (this._numberType == null) {
                  int len = Array.getLength(value);
                  Object array = Array.newInstance(this._componentType, len);

                  try {
                     System.arraycopy(value, 0, array, 0, len);
                  } catch (Exception e) {
                     JSONPojoConvertor.LOG.ignore(e);
                     this._setter.invoke(obj, value);
                     return;
                  }

                  this._setter.invoke(obj, array);
               } else {
                  Object[] old = (Object[]) value;
                  Object array = Array.newInstance(this._componentType, old.length);

                  try {
                     for(int i = 0; i < old.length; ++i) {
                        Array.set(array, i, this._numberType.getActualValue((Number)old[i]));
                     }
                  } catch (Exception e) {
                     JSONPojoConvertor.LOG.ignore(e);
                     this._setter.invoke(obj, value);
                     return;
                  }

                  this._setter.invoke(obj, array);
               }
            } else {
               this._setter.invoke(obj, value);
            }
         } else {
            this._setter.invoke(obj, String.valueOf(value).charAt(0));
         }

      }
   }

   public interface NumberType {
      Object getActualValue(Number var1);
   }
}
