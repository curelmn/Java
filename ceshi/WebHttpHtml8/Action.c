Action()
{

	web_add_cookie("Idea-8296e76f=a505b4b2-8ab0-40ac-8e15-d5593699560b; DOMAIN=localhost");

	web_url("problem", 
		"URL=http://localhost:8080/my_oj/problem", 
		"Resource=1", 
		"RecContentType=application/json", 
		"Referer=http://localhost:8080/my_oj/", 
		"Snapshot=t4.inf", 
		LAST);

	web_url("problem_2", 
		"URL=http://localhost:8080/my_oj/problem?id=2", 
		"Resource=1", 
		"RecContentType=application/json", 
		"Referer=http://localhost:8080/my_oj/", 
		"Snapshot=t5.inf", 
		LAST);

	lr_think_time(6);

	web_custom_request("compile", 
		"URL=http://localhost:8080/my_oj/compile", 
		"Method=POST", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=http://localhost:8080/my_oj/", 
		"Snapshot=t6.inf", 
		"Mode=HTML", 
		"EncType=application/json; charset=UTF-8", 
		"Body={\"id\":2,\"code\":\"class Solution {\\n    public int[] twoSum(int[] nums, int target) {\\n       for(int i=0;i<nums.length;i++){\\n           for(int j=i+1;j<nums.length;j++){\\n               if(nums[i]+nums[j]==target){\\n                   return new int[] {i,j};\\n               }\\n           }\\n       }\\n       return new int[0];\\n    }\\n}\"}", 
		LAST);

	return 0;
}