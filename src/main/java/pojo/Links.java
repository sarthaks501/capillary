
package pojo;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "self",
    "html",
    "issue",
    "comments",
    "review_comments",
    "review_comment",
    "commits",
    "statuses"
})
public class Links implements Serializable
{

    @JsonProperty("self")
    private Self self;
    @JsonProperty("html")
    private Html html;
    @JsonProperty("issue")
    private Issue issue;
    @JsonProperty("comments")
    private Comments comments;
    @JsonProperty("review_comments")
    private ReviewComments reviewComments;
    @JsonProperty("review_comment")
    private ReviewComment reviewComment;
    @JsonProperty("commits")
    private Commits commits;
    @JsonProperty("statuses")
    private Statuses statuses;
    private final static long serialVersionUID = 8317315519641155739L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Links() {
    }

    /**
     * 
     * @param issue
     * @param commits
     * @param html
     * @param self
     * @param reviewComments
     * @param statuses
     * @param reviewComment
     * @param comments
     */
    public Links(Self self, Html html, Issue issue, Comments comments, ReviewComments reviewComments, ReviewComment reviewComment, Commits commits, Statuses statuses) {
        super();
        this.self = self;
        this.html = html;
        this.issue = issue;
        this.comments = comments;
        this.reviewComments = reviewComments;
        this.reviewComment = reviewComment;
        this.commits = commits;
        this.statuses = statuses;
    }

    @JsonProperty("self")
    public Self getSelf() {
        return self;
    }

    @JsonProperty("self")
    public void setSelf(Self self) {
        this.self = self;
    }

    @JsonProperty("html")
    public Html getHtml() {
        return html;
    }

    @JsonProperty("html")
    public void setHtml(Html html) {
        this.html = html;
    }

    @JsonProperty("issue")
    public Issue getIssue() {
        return issue;
    }

    @JsonProperty("issue")
    public void setIssue(Issue issue) {
        this.issue = issue;
    }

    @JsonProperty("comments")
    public Comments getComments() {
        return comments;
    }

    @JsonProperty("comments")
    public void setComments(Comments comments) {
        this.comments = comments;
    }

    @JsonProperty("review_comments")
    public ReviewComments getReviewComments() {
        return reviewComments;
    }

    @JsonProperty("review_comments")
    public void setReviewComments(ReviewComments reviewComments) {
        this.reviewComments = reviewComments;
    }

    @JsonProperty("review_comment")
    public ReviewComment getReviewComment() {
        return reviewComment;
    }

    @JsonProperty("review_comment")
    public void setReviewComment(ReviewComment reviewComment) {
        this.reviewComment = reviewComment;
    }

    @JsonProperty("commits")
    public Commits getCommits() {
        return commits;
    }

    @JsonProperty("commits")
    public void setCommits(Commits commits) {
        this.commits = commits;
    }

    @JsonProperty("statuses")
    public Statuses getStatuses() {
        return statuses;
    }

    @JsonProperty("statuses")
    public void setStatuses(Statuses statuses) {
        this.statuses = statuses;
    }

}
