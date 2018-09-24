package jp.team.study.book.manage.interfaces.definitions.responses;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Deprecated
@ApiModel(description = "Sample")
public class Sample {

    @ApiModelProperty(example = "AA01", value = "id")
    private Long id;

    @ApiModelProperty(example = "AA01", value = "updateCount")
    private Integer updateCount;

    @ApiModelProperty(example = "AA01", value = "createDatetime")
    private LocalDateTime createDatetime;

    @ApiModelProperty(example = "AA01", value = "updateDatetime")
    private LocalDateTime updateDatetime;
}
