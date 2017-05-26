
package pojo;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id"
})
public class Installation implements Serializable
{

    @JsonProperty("id")
    private Integer id;
    private final static long serialVersionUID = -3834140958740499504L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Installation() {
    }

    /**
     * 
     * @param id
     */
    public Installation(Integer id) {
        super();
        this.id = id;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

}
