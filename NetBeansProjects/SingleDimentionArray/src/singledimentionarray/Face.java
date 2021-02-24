/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singledimentionarray;
import java.util.Random;

/**
 * A simple class of face
 * @author 2003i
 */
public class Face {
    private int eyeType;
    private int noseType;
    private String mouthColor;
    
    public static final int MAX_EYE_TYPE = 2;
    public static final int MAX_NOSE_TYPE = 2;
    public static final String[] VALID_MOUTH_COLORS = {"Red", "Pink", "Orange"};

    public Face() {
        Random rand = new Random();
        this.eyeType = rand.nextInt(MAX_EYE_TYPE + 1);
        this.noseType = rand.nextInt(MAX_NOSE_TYPE + 1);
        this.mouthColor = VALID_MOUTH_COLORS[rand.nextInt(VALID_MOUTH_COLORS.length)];
    }
    
    public Face(int eyeType, int noseType, String mouthColor) {
        if (eyeType < 0 || eyeType > MAX_EYE_TYPE) {
            this.eyeType = 0;
        }
        else {
            this.eyeType = eyeType;
        }
        if (noseType < 0 || noseType > MAX_NOSE_TYPE) {
            this.noseType = 0;
        }
        else {
            this.noseType = noseType;
        }
        if (!isMouthColorValid(mouthColor)) {
            this.mouthColor = VALID_MOUTH_COLORS[0];
        }
        else{
            this.mouthColor = mouthColor;
        }
    }
    
    public static boolean isMouthColorValid(String mouthColor) {
        for (String validMouthColor : VALID_MOUTH_COLORS) {
            if (mouthColor.equalsIgnoreCase(validMouthColor)) {
                return true;
            }
        }
            return false;
    }

    public void setEyeType(int eyeType) {
        if (eyeType < 0 || eyeType > MAX_EYE_TYPE) {
            this.eyeType = 0;
        } else {
            this.eyeType = eyeType;
        }
    }

    public void setNoseType(int noseType) {
        if (noseType < 0 || noseType > MAX_NOSE_TYPE) {
            this.noseType = 0;
        } else {
            this.noseType = noseType;
        }
    }

    public void setMouthColor(String mouthColor) {
        if (!isMouthColorValid(mouthColor)) {
            this.mouthColor = VALID_MOUTH_COLORS[0];
        }
        else{
            this.mouthColor = mouthColor;
        }
    }
    
    
}
