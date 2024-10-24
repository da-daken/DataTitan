package com.dataTian.service.analysis.impl;

import com.dataTian.service.analysis.AnalysisService;
import com.dataTian.service.analysis.model.Template.AbstractBaseDataTemplate;
import com.dataTian.service.analysis.model.result.AbstractBaseDataResult;

/**
 * @author daken 2024/10/25
 **/
public class AnalysisServiceImpl implements AnalysisService {

    public AbstractBaseDataResult analyze(AbstractBaseDataTemplate baseDataTemplate) {
        // 1. 入参数据进行检查

        // 2. 将数据转换成能处理的数据
        // 数据清洗：去除无关信息，填补缺失值，纠正错误数据
        // 数据转换：将数据转换成适合分析的格式，例如将文本数据转化为数值特征
        // 数据标准化/归一化：使数据处于相同的尺度上，便于后续处理

        // 3. 数据分析

        // 4. 输出

        return null;
    }
}
