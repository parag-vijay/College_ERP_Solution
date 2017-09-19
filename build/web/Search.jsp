<%-- 
    Document   : Search
    Created on : Dec 11, 2014, 10:59:56 AM
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="searchStyle.css">
        <script type="text/javascript" src="searchScript.js"></script>
    </head>
    <body>
        <div id="search-div1">
            <input type="radio" name="choose-search" id="enrollment-vise" onclick="refineSearch(id)">search by enrollment no.
            <input type="radio" name="choose-search" id="branch-vise" onclick="refineSearch(id)">search by branch
            <input type="radio" name="choose-search" id="year-vise" onclick="refineSearch(id)">search by year
        </div>
        <div id="search-div2">
            
        </div>
        
        <div id="search-button"></div>
    </body>
</html>