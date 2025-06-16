class Song(title: String,
               author: String,
               val duration: Int) extends Media(title, author) with Playable
