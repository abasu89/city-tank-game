package objects;

public class GameObject {
    private int rowPos, colPos;
    private int width, height;
    private String color;

    public GameObject(int rowIndex, int colIndex, int width, int height) {
        rowPos = rowIndex;
        colPos = colIndex;
        this.width = width;
        this.height = height;
    }

    public int getRowPos() {
    return rowPos;
    }

    public void setRowPos(int rowPos) {
        this.rowPos = rowPos;
    }

    public int getColPos() {
      return colPos;
    }

    public void setColPos(int colPos) {
        this.colPos = colPos;
    }

    public int getWidth() {
      return width;
    }

    public int getHeight() {
      return height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char[][] draw() {
        char[][] bitmap = new char[getHeight()][getWidth()];
        for (int i = 0; i < getHeight(); i++)
            for (int j = 0; j < getWidth(); j++)
                bitmap[i][j] = '*';
        return bitmap;
    }
}
