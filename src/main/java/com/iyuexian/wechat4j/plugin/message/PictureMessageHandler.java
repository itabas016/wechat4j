package com.iyuexian.wechat4j.plugin.message;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.blade.kit.json.JSONObject;
import com.iyuexian.wechat4j.WechatMeta;
import com.iyuexian.wechat4j.config.Enums.MsgType;

public class PictureMessageHandler extends AbstractMessageHandler {

	private static final Logger LOGGER = LoggerFactory.getLogger(PictureMessageHandler.class);

	public PictureMessageHandler(WechatMeta meta) {
		super(meta);
		this.meta = meta;
	}

	@Override
	public void process(JSONObject msg) {
		LOGGER.info("开始处理图片消息");
		download(msg, MsgType.PICTURE);

	}
}
