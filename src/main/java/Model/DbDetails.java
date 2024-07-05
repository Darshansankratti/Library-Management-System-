package Model;

public class DbDetails {
 private String url;
 private String username;
 private String pwd;
public DbDetails(String url, String username, String pwd) {
	super();
	this.url = url;
	this.username = username;
	this.pwd = pwd;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
@Override
public String toString() {
	return "DbDetails [url=" + url + ", username=" + username + ", pwd=" + pwd + "]";
}
 
}
