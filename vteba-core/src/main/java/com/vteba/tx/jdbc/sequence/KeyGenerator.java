package com.vteba.tx.jdbc.sequence;

/**
 * 抽象主键生成的公共接口。
 * @author 尹雷 
 * @since 2013-12-1
 */
public interface KeyGenerator {

    /**
     * 根据业务类型获取sequence，并添加前缀prefix。
     * 
     * @param prefix
     *            业务类型前缀
     * @return 业务类型前缀 + sequence
     */
    public String next(String prefix);

    /**
     * 获取当前所配置的sequence或table模拟的sequence的字符串值。
     * @return sequence string value
     */
    public String next();
    
    /**
     * 根据业务类型获取sequence，并添加后缀suffix
     * @return sequence + 后缀
     */
    public String nextKey(String suffix);

    /**
     * 获取当前所配置的sequence或table模拟的sequence的字符串值。
     * @return sequence int value
     */
    public int nextInt();

    /**
     * 获取当前所配置的sequence或table模拟的sequence的字符串值
     * @return sequence long value
     */
    public long nextLong();

    /**
     * 如果没有建sequence，可以使用这个来模拟生成主键。当前时间精确到毫秒加上一个随机数
     * 
     * @return sequence value
     */
    public long nextValue();

}
