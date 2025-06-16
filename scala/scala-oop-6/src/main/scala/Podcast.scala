class Podcast(title: String,
              author: String,
              val duration: Int) extends Media(title, author) with Playable with Downloadable
