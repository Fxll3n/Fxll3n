# Hi there! 👋

I'm [Your Name], a [Your Role] passionate about [Your Interests].

## 📝 Latest Blog Posts
{{range rss "https://your-blog.com/feed.xml" 5}}
- [{{.Title}}]({{.URL}}) - {{humanize .PublishedAt}}
{{end}}

## 🎬 Latest YouTube Videos
{{range youtube "UCyourChannelID" 5}}
- [{{.Title}}]({{.URL}}) - {{humanize .PublishedAt}}
{{end}}

## 📊 GitHub Stats
{{range ghReleases "username" 5}}
- [{{.Name}}]({{.URL}}) - {{humanize .PublishedAt}}
{{end}}

## 🎵 Recently Played Spotify
{{range spotify "last-played" 5}}
- [{{.Track}}]({{.URL}}) by {{.Artist}}
{{end}}

## 🐦 Latest Tweets
{{range twitter "yourusername" 5}}
- {{.Text}} - {{humanize .CreatedAt}}
{{end}}
