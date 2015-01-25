package com.game.gameServer.framework;

import com.game.core.msg.BaseMsg;
import com.game.core.scene.MyScene;
import com.game.gameServer.msg.AbstractChatMsg;

/**
 * 聊天场景
 * 
 * @author hjj2019
 * @since 2015/01/24
 *
 */
class ChatScene extends MyScene {
	/**
	 * 类默认构造器
	 * 
	 */
	public ChatScene() {
		super(ChatScene.class.getSimpleName());
	}

	@Override
	protected boolean canRecevie(BaseMsg msgObj) {
		if (msgObj == null) {
			return false;
		} else {
			return (msgObj instanceof AbstractChatMsg);
		}
	}
}