package com.horrific.common.dto.chart;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ChartInfo implements Serializable {

    private Integer chartType;

    private List<Map<String,Object>> dataList;

    private List<Field> dims;

    private List<Field> measures;

    private String dim;

    private String measure;
}
