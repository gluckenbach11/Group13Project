/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

/**
 *
 * @author gluck
 */
public class PlayerScore 
{
    private String playerName = "";
    private String date = ""; 
    private int game1Score;
    private int game2Score;
    private int game3Score;
    private int game4Score;
    private int game5Score;
    private int playTime;
    
    public PlayerScore()
    {      
    }

    /**
     * @return the game1Score
     */
    public int getGame1Score() {
        return game1Score;
    }

    /**
     * @param game1Score the game1Score to set
     */
    public void setGame1Score(int game1Score) {
        this.game1Score = game1Score;
    }

    /**
     * @return the game2Score
     */
    public int getGame2Score() {
        return game2Score;
    }

    /**
     * @param game2Score the game2Score to set
     */
    public void setGame2Score(int game2Score) {
        this.game2Score = game2Score;
    }

    /**
     * @return the game3Score
     */
    public int getGame3Score() {
        return game3Score;
    }

    /**
     * @param game3Score the game3Score to set
     */
    public void setGame3Score(int game3Score) {
        this.game3Score = game3Score;
    }

    /**
     * @return the game4Score
     */
    public int getGame4Score() {
        return game4Score;
    }

    /**
     * @param game4Score the game4Score to set
     */
    public void setGame4Score(int game4Score) {
        this.game4Score = game4Score;
    }

    /**
     * @return the game5Score
     */
    public int getGame5Score() {
        return game5Score;
    }

    /**
     * @param game5Score the game5Score to set
     */
    public void setGame5Score(int game5Score) {
        this.game5Score = game5Score;
    }

    /**
     * @return the playerName
     */
    public String getPlayerName() {
        return playerName;
    }

    /**
     * @param playerName the playerName to set
     */
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    /**
     * @return the playTime
     */
    public int getPlayTime() {
        return playTime;
    }

    /**
     * @param playTime the playTime to set
     */
    public void setPlayTime(int playTime) {
        this.playTime = playTime;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }
}
