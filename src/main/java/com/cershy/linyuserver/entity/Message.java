package com.cershy.linyuserver.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;
import com.cershy.linyuserver.entity.ext.MsgContent;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 消息表
 * </p>
 *
 * @author heath
 * @since 2024-05-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("message")
public class Message implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("id")
    private String id;

    /**
     * 消息发送方id
     */
    @TableField("from_id")
    private String fromId;

    /**
     * 消息接受方id
     */
    @TableField("to_id")
    private String toId;

    /**
     * 消息类型
     */
    @TableField("type")
    private String type;

    /**
     * 消息内容
     */
    @TableField(value = "msg_content", typeHandler = JacksonTypeHandler.class)
    private MsgContent msgContent;

    /**
     * 消息状态
     */
    @TableField("status")
    private String status;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField("create_time")
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField("update_time")
    private LocalDateTime updateTime;


}