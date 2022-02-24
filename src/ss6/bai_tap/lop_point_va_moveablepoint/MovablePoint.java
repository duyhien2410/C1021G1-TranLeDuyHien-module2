package ss6.bai_tap.lop_point_va_moveablepoint;

public class MovablePoint extends Point{
    public float xSpeed;
    public float ySpeed;

    public MovablePoint() {
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public float[] getSpeed(){
        float[] array={xSpeed,ySpeed};
        return array;
    }

    @Override
    public String toString() {
        return "("  + x +
                "," + y +
                "),speed=(" + xSpeed +
                "," + ySpeed + ")";
    }

    public MovablePoint move(){
        x += xSpeed;
        y += ySpeed;
        return this;
    }
}
