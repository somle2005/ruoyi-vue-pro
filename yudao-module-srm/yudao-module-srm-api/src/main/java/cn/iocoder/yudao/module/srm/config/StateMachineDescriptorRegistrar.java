package cn.iocoder.yudao.module.srm.config;


public interface StateMachineDescriptorRegistrar {

    void register(StateMachineDescriptorRegistry registry);

    interface StateMachineDescriptorRegistry {
        void add(Class<?> contextClass, Class<?> stateClass, String description);
    }
}
