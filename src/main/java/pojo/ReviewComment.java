
package pojo;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "href"
})
public class ReviewComment implements Serializable
{

    @JsonProperty("href")
    private String href;
    private final static long serialVersionUID = -7793063728244505456L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ReviewComment() {
    }

    /**
     * 
     * @param href
     */
    public ReviewComment(String href) {
        super();
        this.href = href;
    }

    @JsonProperty("href")
    public String getHref() {
        return href;
    }

    @JsonProperty("href")
    public void setHref(String href) {
        this.href = href;
    }

}
