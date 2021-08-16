Action()
{

	web_add_cookie("Idea-8296e76f=a505b4b2-8ab0-40ac-8e15-d5593699560b; DOMAIN=localhost");

	web_url("problem", 
		"URL=http://localhost:8080/my_oj/problem", 
		"Resource=1", 
		"RecContentType=application/json", 
		"Referer=http://localhost:8080/my_oj/", 
		"Snapshot=t1.inf", 
		LAST);

	return 0;
}