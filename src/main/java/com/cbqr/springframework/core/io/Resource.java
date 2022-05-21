package com.cbqr.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * 资源加载接口，提供获取 InputStream 流的方法
 *
 * @author Dave Liu
 * @since 2022-05-21
 */
public interface Resource {

    InputStream getInputStream() throws IOException;

}
