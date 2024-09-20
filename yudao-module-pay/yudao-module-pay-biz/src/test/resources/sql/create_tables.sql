CREATE TABLE IF NOT EXISTS "pay_app" (
    "id" number NOT NULL GENERATED BY DEFAULT AS IDENTITY,
    "app_key"              varchar(64)   NOT NULL,
    "name"              varchar(64)   NOT NULL,
    "status"            tinyint       NOT NULL,
    "remark"            varchar(255)           DEFAULT NULL,
    `order_notify_url`    varchar(1024) NOT NULL,
    `refund_notify_url` varchar(1024) NOT NULL,
    "creator"           varchar(64)            DEFAULT '',
    "create_time"       datetime      NOT NULL DEFAULT CURRENT_TIMESTAMP,
    "updater"           varchar(64)            DEFAULT '',
    "update_time"       datetime      NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    "deleted"           bit(1)        NOT NULL DEFAULT FALSE,
    PRIMARY KEY ("id")
) COMMENT = '支付应用';

CREATE TABLE IF NOT EXISTS "pay_channel" (
    "id" number NOT NULL GENERATED BY DEFAULT AS IDENTITY,
    "code"        varchar(32)    NOT NULL,
    "status"      tinyint(4)     NOT NULL,
    "remark"      varchar(255)            DEFAULT NULL,
    "fee_rate"    double         NOT NULL DEFAULT 0,
    "app_id"      bigint(20)     NOT NULL,
    "config"      varchar(10240) NOT NULL,
    "creator"     varchar(64)    NULL     DEFAULT '',
    "create_time" datetime       NOT NULL DEFAULT CURRENT_TIMESTAMP,
    "updater"     varchar(64)    NULL     DEFAULT '',
    "update_time" datetime       NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    "deleted"     bit(1)         NOT NULL DEFAULT FALSE,
    "tenant_id" bigint not null default  '0',
    PRIMARY KEY ("id")
) COMMENT = '支付渠道';

CREATE TABLE IF NOT EXISTS `pay_order` (
    "id" number NOT NULL GENERATED BY DEFAULT AS IDENTITY,
    `app_id`               bigint(20)    NOT NULL,
    `channel_id`           bigint(20)             DEFAULT NULL,
    `channel_code`         varchar(32)            DEFAULT NULL,
    `merchant_order_id`    varchar(64)   NOT NULL,
    `subject`              varchar(32)   NOT NULL,
    `body`                 varchar(128)  NOT NULL,
    `notify_url`           varchar(1024) NOT NULL,
    `price`                bigint(20)    NOT NULL,
    `channel_fee_rate`     double                 DEFAULT 0,
    `channel_fee_price`    bigint(20)             DEFAULT 0,
    `status`               tinyint(4)    NOT NULL,
    `user_ip`              varchar(50)   NOT NULL,
    `expire_time`          timestamp   NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `success_time`         datetime(0)            DEFAULT CURRENT_TIMESTAMP,
    `notify_time`          datetime(0)            DEFAULT CURRENT_TIMESTAMP,
    `extension_id` bigint(20)             DEFAULT NULL,
    `no`                   varchar(64)   NULL,
    `refund_price`         bigint(20)    NOT NULL,
    `channel_user_id`      varchar(255)           DEFAULT NULL,
    `channel_order_no`     varchar(64)            DEFAULT NULL,
    `creator`              varchar(64)            DEFAULT '',
    `create_time`          datetime(0)   NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `updater`              varchar(64)            DEFAULT '',
    `update_time`          datetime(0)   NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    `deleted`              bit(1)        NOT NULL DEFAULT FALSE,
    PRIMARY KEY ("id")
) COMMENT = '支付订单';

CREATE TABLE IF NOT EXISTS `pay_order_extension` (
    "id" number NOT NULL GENERATED BY DEFAULT AS IDENTITY,
    `no`           varchar(64)         NOT NULL,
    `order_id`           bigint(20)    NOT NULL,
    `channel_id`         bigint(20)    NOT NULL,
    `channel_code`       varchar(32)   NOT NULL,
    `user_ip`            varchar(50)   NULL     DEFAULT NULL,
    `status`             tinyint(4)    NOT NULL,
    `channel_extras`     varchar(1024) NULL     DEFAULT NULL,
    `channel_error_code`  varchar(64)  NULL,
    `channel_error_msg` varchar(64)    NULL,
    `channel_notify_data` varchar(1024)  NULL,
    `creator`            varchar(64)   NULL     DEFAULT '',
    `create_time`        datetime(0)   NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `updater`            varchar(64)   NULL     DEFAULT '',
    `update_time`        datetime(0)   NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    `deleted`            bit(1)        NOT NULL DEFAULT FALSE,
    PRIMARY KEY ("id")
) COMMENT = '支付订单拓展';

CREATE TABLE IF NOT EXISTS `pay_refund` (
    "id" number NOT NULL GENERATED BY DEFAULT AS IDENTITY,
    `no`           varchar(64)         NOT NULL,
    `app_id`             bigint(20)    NOT NULL,
    `channel_id`         bigint(20)    NOT NULL,
    `channel_code`       varchar(32)   NOT NULL,
    `order_id`           bigint(20)    NOT NULL,
    `order_no`           varchar(64)    NOT NULL,
    `merchant_order_id`  varchar(64)   NOT NULL,
    `merchant_refund_id` varchar(64)   NOT NULL,
    `notify_url`         varchar(1024) NOT NULL,
    `status`             tinyint(4)    NOT NULL,
    `pay_price`         bigint(20)    NOT NULL,
    `refund_price`      bigint(20)    NOT NULL,
    `reason`             varchar(256)  NOT NULL,
    `user_ip`            varchar(50)   NULL     DEFAULT NULL,
    `channel_order_no`   varchar(64)   NOT NULL,
    `channel_refund_no`  varchar(64)   NULL     DEFAULT NULL,
    `success_time`       datetime(0)   NULL     DEFAULT NULL,
    `channel_error_code` varchar(128)  NULL     DEFAULT NULL,
    `channel_error_msg`  varchar(256)  NULL     DEFAULT NULL,
    `channel_notify_data` varchar(1024)  NULL,
    `creator`            varchar(64)   NULL     DEFAULT '',
    `create_time`        datetime(0)   NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `updater`            varchar(64)   NULL     DEFAULT '',
    `update_time`        datetime(0)   NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    `deleted`            bit(1)        NOT NULL DEFAULT FALSE,
    PRIMARY KEY ("id")
) COMMENT = '退款订单';

CREATE TABLE IF NOT EXISTS `pay_notify_task` (
    "id" number NOT NULL GENERATED BY DEFAULT AS IDENTITY,
    `app_id`             bigint(20)    NOT NULL,
    `type`               tinyint(4)    NOT NULL,
    `data_id`           bigint(20)    NOT NULL,
    `merchant_order_id`           varchar(64)    NOT NULL,
    `status`             tinyint(4)    NOT NULL,
    `next_notify_time`       datetime(0)   NULL     DEFAULT NULL,
    `last_execute_time`       datetime(0)   NULL     DEFAULT NULL,
    `notify_times`         int    NOT NULL,
    `max_notify_times`         int    NOT NULL,
    `notify_url`         varchar(1024) NOT NULL,
    `creator`            varchar(64)   NULL     DEFAULT '',
    `create_time`        datetime(0)   NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `updater`            varchar(64)   NULL     DEFAULT '',
    `update_time`        datetime(0)   NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    `deleted`            bit(1)        NOT NULL DEFAULT FALSE,
    `tenant_id`           bigint(20)    NOT NULL DEFAULT 0,
    PRIMARY KEY ("id")
) COMMENT = '支付通知任务';

CREATE TABLE IF NOT EXISTS `pay_notify_log` (
    "id" number NOT NULL GENERATED BY DEFAULT AS IDENTITY,
    `task_id`             bigint(20)    NOT NULL,
    `notify_times`         int    NOT NULL,
    `response`         varchar(1024) NOT NULL,
    `status`             tinyint(4)    NOT NULL,
    `creator`            varchar(64)   NULL     DEFAULT '',
    `create_time`        datetime(0)   NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `updater`            varchar(64)   NULL     DEFAULT '',
    `update_time`        datetime(0)   NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    `deleted`            bit(1)        NOT NULL DEFAULT FALSE,
    PRIMARY KEY ("id")
) COMMENT = '支付通知日志';
