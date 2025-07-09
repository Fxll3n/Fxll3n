# Hi there 👋

{{ wakatimeDoubleCategoryBar "💾 Languages:" wakatimeData.Languages "💼 Projects:" wakatimeData.Projects 5 }}

### 🔨 Currently Working On
{{ range recentContributions 5 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) – {{ .Repo.Description }}
{{- end }}

### 🌟 Recent Stars
{{ range recentStars 5 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) – {{ .Repo.Description }}
{{- end }}

