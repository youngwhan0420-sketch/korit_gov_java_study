package _22_Bean;

import java.time.LocalDateTime;

public class BoardEntity {
    private int boardId;
    private String boardContent;
    private String boardTitle;
    private int UserId;
    private String username;
    private LocalDateTime createDt;
    private LocalDateTime updateDt;

    public int getBoardid() {
        return boardId;
    }

    public String getBoardContent() {
        return boardContent;
    }

    public int getUserId() {
        return UserId;
    }

    public String getBoardTitle() {
        return boardTitle;
    }

    public String getUsername() {
        return username;
    }

    public void setBoardid(int boardid) {
        this.boardId = boardid;
    }

    public void setBoardContent(String boardContent) {
        this.boardContent = boardContent;
    }

    public void setBoardTitle(String boardTitle) {
        this.boardTitle = boardTitle;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
