package modbus.model;

import org.jboss.netty.buffer.ChannelBuffer;

/**
 *
 * @author ares
 */
public interface RequestInterface {
    public ChannelBuffer encode();
}
