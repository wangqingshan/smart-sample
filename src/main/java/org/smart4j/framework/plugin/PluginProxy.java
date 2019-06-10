package org.smart4j.framework.plugin;

import org.smart4j.framework.aop.proxy.Proxy;

import java.util.List;

/**
 * 插件代理
 *
 * @author huangyong
 * @since 2.0
 */
public abstract class PluginProxy implements Proxy {

    public abstract List<Class<?>> getTargetClassList();
}
