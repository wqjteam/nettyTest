package com.wqj.pojo;

import java.io.Serializable;

/**
 * @Description: TODO
 * @author wqj
 * @date 2018年3月15日 下午4:27:08 
 */
public class NettyRequset implements Serializable{
	
    private String className;//类名  
    
    private String methodName;//函数名称  
    
    private Class<?>[] types;//参数类型    
    
    private Object[] objects;//参数列表 
    
    
    
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getMethodName() {
		return methodName;
	}
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	public Class<?>[] getTypes() {
		return types;
	}
	public void setTypes(Class<?>[] types) {
		this.types = types;
	}
	public Object[] getObjects() {
		return objects;
	}
	public void setObjects(Object[] objects) {
		this.objects = objects;
	}
    
    
}