package com.game.part.msg.type;

import java.time.LocalDateTime;

import org.apache.mina.core.buffer.IoBuffer;

import com.game.part.msg.IoBuffUtil;

/**
 * 消息中的 Int 类型字段
 * 
 * @author hjj2017
 * @since 2015/3/15
 * 
 */
public class MsgLocalDateTime extends BasicTypeField<LocalDateTime> {
	/**
	 * 类默认构造器
	 * 
	 */
	public MsgLocalDateTime() {
		this(LocalDateTime.now());
	}

	/**
	 * 类参数构造器
	 * 
	 * @param value
	 * 
	 */
	public MsgLocalDateTime(LocalDateTime value) {
		this.setObjVal(value);
	}

	@Override
	public void readBuff(IoBuffer buff) {
	}

	@Override
	public void writeBuff(IoBuffer buff) {
		IoBuffUtil.writeLong(this.getLongVal(), buff);
	}

	/**
	 * objVal 不能为 null, 但如果真为 null, 则自动创建并返回
	 * 
	 * @param objVal
	 * @return
	 * 
	 */
	public static MsgLocalDateTime ifNullThenCreate(MsgLocalDateTime objVal) {
		if (objVal == null) {
			// 创建对象
			objVal = new MsgLocalDateTime();
		}

		return objVal;
	}
}
