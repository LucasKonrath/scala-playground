abstract class Media(
                      val title: String,
                      val author: String
                    ) {
  def info(): Unit = {
    println(s"Title: $title")
    println(s"Author: $author")
  }
}