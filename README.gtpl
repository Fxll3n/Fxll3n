# Hi there 👋

{{ $w := wakatime "https://waka.hackclub.com" (env "WAKA_KEY") }}

{{ wakatimeDoubleCategoryBar "💾 Languages:" $w.Languages "💼 Projects:" $w.Projects 5 }}

### 🔨 Currently Working On
{{ range recentContributions 5 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) – {{ .Repo.Description }}
{{- end }}

### 🌟 Recent Stars
{{ range recentStars 5 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) – {{ .Repo.Description }}
{{- end }}

