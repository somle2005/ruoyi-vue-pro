#!/bin/bash

# Script to deploy somle-esb service

SERVICE_NAME="yudao"
SERVICE_FILE="/etc/systemd/system/${SERVICE_NAME}.service"
JAR_PATH=$(ls /opt/module/${SERVICE_NAME}/yudao-server/target/*.jar | head -n 1)

# 安装字体函数（支持 Ubuntu 和 CentOS）
install_fonts() {
    echo "$(date) - Installing Chinese fonts..."

    if [ -f /etc/os-release ]; then
        . /etc/os-release
        if [[ "$ID" == "ubuntu" || "$ID_LIKE" == *"debian"* ]]; then
            apt update
            apt install -y fonts-noto-cjk
        elif [[ "$ID" == "centos" || "$ID_LIKE" == *"rhel"* ]]; then
            yum install -y google-noto-sans-cjk-fonts
        else
            echo "$(date) - Unknown OS, please install fonts manually."
        fi
    fi

    echo "$(date)  install_font: 中文字体安装完成。"
}

# Function to create or overwrite the service file
create_service_file() {
    cat <<EOL > "$SERVICE_FILE"
[Unit]
Description=$SERVICE_NAME
After=network.target

[Service]
User=root
ExecStart=/usr/bin/java -jar $JAR_PATH --server.port=55002 --spring.profiles.active=prod
Restart=always

[Install]
WantedBy=multi-user.target
EOL

    echo "$(date) - Service file created at $SERVICE_FILE"
}

# Function to deploy the service
deploy_service() {
    echo "$(date) - Reloading systemd manager configuration..."
    systemctl daemon-reload

    echo "$(date) - Enabling $SERVICE_NAME service..."
    systemctl enable $SERVICE_NAME

    echo "$(date) - Restarting $SERVICE_NAME service..."
    systemctl restart $SERVICE_NAME

    echo "$(date) - $SERVICE_NAME service deployed and started successfully."
}

# Main execution
install_fonts

echo "$(date) - Creating the service file..."
create_service_file

echo "$(date) - Deploying the $SERVICE_NAME service..."
deploy_service

echo "$(date) - Deployment script completed."
