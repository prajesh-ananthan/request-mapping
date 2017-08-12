#!/bin/bash
URL=http://localhost:8080/home

echo "curl $URL/method0";
curl $URL/method0;
printf "\n\n*****\n\n";

echo "curl $URL/method1";
curl $URL/method1;
printf "\n\n*****\n\n";

echo "curl -X POST $URL/method2";
curl -X POST $URL/method2;
printf "\n\n*****\n\n";

echo "curl -X GET $URL/method2";
curl -X GET $URL/method2;
printf "\n\n*****\n\n";

echo "curl -H "name:prajesh" $URL/method3";
curl -H name:prajesh $URL/method3;
printf "\n\n*****\n\n";

echo "curl $URL/method4/20/divya";
curl $URL/method4/20/divya;
printf "\n\n*****\n\n";

echo "curl $URL/method5/id=10";
curl $URL/method5?id=10;
printf "\n\n*****\n\n";

echo "curl $URL/home/method6";
curl $URL/method6;
printf "\n\n*****\n\n";

echo "curl -H "Content-Type:text/html" -H "Accept:application/json" -i $URL/method6";
curl -H "Content-Type:text/html" -H "Accept:application/json" -i $URL/method6;
printf "\n\n*****\n\n";

echo "curl -H "Content-Type:text/html" -H "Accept:application/xml" -i $URL/home/method6";
curl -H "Content-Type:text/html" -H "Accept:application/xml" -i $URL/method6;
printf "\n\n*****\n\n";