public class Database {
    private String[] colNames;
    private int numRows;
    private String[][] data;

    public String[] getColNames() {
        return colNames;
    }

    public void setColNames(String[] colNames) {
        this.colNames = colNames;
    }

    public int getNumRows() {
        return numRows;
    }

    public void setNumRows(int numRows) {
        this.numRows = numRows;
    }

    public String[][] getData() {
        return data;
    }

    public void setData(String[][] data) {
        this.data = data;
    }

    public Database(String contents) {
/* TODO 
This constructor should take the contents of a CSV file and initialize the member variables of the Database class.
*/
          String[] temp1 = contents.split("\n");
          String[] temp2 = temp1[0].split(",");
          this.colNames = temp2;
          this.numRows = this.colNames.length;

          this.data = new String[this.numRows][this.colNames.length];
          for ( int i = 0; i < this.numRows; i ++)
          {
              String[] temp3 = temp1[i].split(",");
              for (int j = 0; j < this.colNames.length; j++ )
              {
                  this.data[i][j] = temp3[ j ];
              }
          }
    }

    public String getValue(String columnName,int row){
/* TODO
This method should return the data contained on row "row" and the column matching  @columnName
*/
        int column = 0;
        for ( int i = 0; i < this.colNames.length; i++ ) {
            if (this.colNames[i].equals(columnName))
                column = i;
        }
        return data[row][column];
    }

}


