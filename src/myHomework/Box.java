package myHomework;

public class Box {
    private Integer width;
    private Integer height;
    private Integer depth;
    private String boxType;

    public Box(Integer width,Integer height, Integer depth) {

        this.width = width;
        this.height = height;
        this.depth = depth;

        if (depth == 0 || depth == null) {
            this.boxType = "envelope";
        } else if (width.equals(height) && width.equals(depth)) {
            this.boxType = "cube";
            return;
        } else if (!width.equals(height) || !width.equals(depth)) {
            this.boxType = "simpleBox";
            return;
        }

    }
    public int getWidth () {
        return width;
    }

    public int getHeight () {
        return height;
    }

    public int getDepth () {
        return depth;
    }

    public String getBoxType () {
        return this.boxType;
    }

}
