package id.ac.ubaya.informatika.todoapp.model


    @Entity
    data class Todo(
        @ColumnInfo(name="title")
        var title:String,
        @ColumnInfo(name="notes")
        var notes:String
    ) {
        @PrimaryKey(autoGenerate = true)
        var uuid:Int =0
    }