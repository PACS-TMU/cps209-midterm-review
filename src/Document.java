public class Document {
    private String id;
    private String subject;
    private String body;
    private String footer;

    public Document(String id)
    {
        this.id = id;
        this.footer = "";
        this.subject = "";
        this.body = "";
    }

    public void print()
    {
        System.out.println(subject + "\n\n" + body + "\n\n" + footer);
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getSubject()
    {
        return subject;
    }

    public void setSubject(String subject)
    {
        this.subject = subject;
    }

    public String getBody()
    {
        return body;
    }

    public void setBody(String body)
    {
        this.body = body;
    }

    public String getFooter()
    {
        return footer;
    }

    public void setFooter(String footer)
    {
        this.footer = footer;
    }
}
