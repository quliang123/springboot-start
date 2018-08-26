package org.n3r.idworker;

/**
 * fetch data by rule id
 *
 * @param
 * @param
 * @param
 * @return Result<XxxxDO>
 */
public interface RandomCodeStrategy {
    void init();

    int prefix();

    int next();

    void release();
}
