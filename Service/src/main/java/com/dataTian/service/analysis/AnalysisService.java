package com.dataTian.service.analysis;

import com.dataTian.service.analysis.model.Template.AbstractBaseDataTemplate;
import com.dataTian.service.analysis.model.result.AbstractBaseDataResult;

/**
 * 核心分析数据接口
 *
 * @author daken 2024/10/25
 **/
public interface AnalysisService {

    /**
     * 核心分析方法
     *
     * @param baseDataTemplate
     */
    AbstractBaseDataResult analyze(AbstractBaseDataTemplate baseDataTemplate);

}
