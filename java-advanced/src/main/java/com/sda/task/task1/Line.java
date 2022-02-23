package com.sda.task.task1;

public class Line {
    Point2D beginPoint;
    Point2D endPoint;

    public Line(Point2D beginPoint, Point2D endPoint){
        this.beginPoint = beginPoint;
        this.endPoint = endPoint;
    }
    public Line(float x1, float y1, float x2, float y2){
        this.beginPoint.x = x1;
        this.beginPoint.y = y1;
        this.endPoint.x = x2;
        this.endPoint.y = y2;
    }

    public Point2D getBeginPoint() {
        return beginPoint;
    }

    public void setBeginPoint(Point2D beginPoint) {
        this.beginPoint = beginPoint;
    }

    public Point2D getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Point2D endPoint) {
        this.endPoint = endPoint;
    }
}
