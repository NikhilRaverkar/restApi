package com.proglang.eqsolver;

public class Util {
	
	static String html1 ="\r\n" + 
			"<!DOCTYPE html>\r\n" + 
			"\r\n" + 
			"<html lang=\"en\">\r\n" + 
			"\r\n" + 
			"    <head>\r\n" + 
			"\r\n" + 
			"        <title>Equation Solver as a Service</title>\r\n" + 
			"\r\n" + 
			"        <meta charset=\"UTF-8\">\r\n" + 
			"        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n" + 
			"\r\n" + 
			"        <link href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\r\n" + 
			"        <style>\r\n" + 
			"        .imageupload.imageupload-disabled {\r\n" + 
			"  cursor: not-allowed;\r\n" + 
			"  opacity: 0.60;\r\n" + 
			"}\r\n" + 
			".imageupload.imageupload-disabled > * {\r\n" + 
			"  pointer-events: none;\r\n" + 
			"}\r\n" + 
			".imageupload .panel-title {\r\n" + 
			"  margin-right: 15px;\r\n" + 
			"  padding-top: 8px;\r\n" + 
			"}\r\n" + 
			".imageupload .alert {\r\n" + 
			"  margin-bottom: 10px;\r\n" + 
			"}\r\n" + 
			".imageupload .btn-file {\r\n" + 
			"  overflow: hidden;\r\n" + 
			"  position: relative;\r\n" + 
			"}\r\n" + 
			".imageupload .btn-file input[type=\"file\"] {\r\n" + 
			"  cursor: inherit;\r\n" + 
			"  display: block;\r\n" + 
			"  font-size: 100px;\r\n" + 
			"  min-height: 100%;\r\n" + 
			"  min-width: 100%;\r\n" + 
			"  opacity: 0;\r\n" + 
			"  position: absolute;\r\n" + 
			"  right: 0;\r\n" + 
			"  text-align: right;\r\n" + 
			"  top: 0;\r\n" + 
			"}\r\n" + 
			".imageupload .file-tab button {\r\n" + 
			"  display: none;\r\n" + 
			"}\r\n" + 
			".imageupload .file-tab .thumbnail {\r\n" + 
			"  margin-bottom: 10px;\r\n" + 
			"}\r\n" + 
			".imageupload .url-tab {\r\n" + 
			"  display: none;\r\n" + 
			"}\r\n" + 
			".imageupload .url-tab .thumbnail {\r\n" + 
			"  margin: 10px 0;\r\n" + 
			"}\r\n" + 
			"        </style>\r\n" + 
			"\r\n" + 
			"        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n" + 
			"\r\n" + 
			"        <script>\r\n" + 
			"        function SubmitImage(data) {\r\n" + 
			"\r\n" + 
			"            var response = JSON.parse(data);\r\n" + 
			"\r\n" + 
			"            //alert(\"Submitimage call zala!\");\r\n" + 
			"            if (response.hasOwnProperty('result')) {\r\n" + 
			"                document.getElementById(\"panel-success\").style.display = \"block\";\r\n" + 
			"                document.getElementById(\"success-content\").innerHTML = response.result;\r\n" + 
			"            }\r\n" + 
			"            else {\r\n" + 
			"                document.getElementById(\"panel-danger\").style.display = \"block\";\r\n" + 
			"                document.getElementById(\"danger-content\").innerHTML = \"Error! There was some server side error while evaluating your input\";\r\n" + 
			"            }\r\n" + 
			"\r\n" + 
			"\r\n" + 
			"            /*var xhttp = new XMLHttpRequest();\r\n" + 
			"\r\n" + 
			"            xhttp.onreadystatechange = function() {\r\n" + 
			"                if (this.status == 200) {\r\n" + 
			"                    var json = JSON.parse(this.responseText);\r\n" + 
			"                    document.getElementById(\"demo\").innerHTML = this.responseText;\r\n" + 
			"                }\r\n" + 
			"                else {\r\n" + 
			"\r\n" + 
			"                }\r\n" + 
			"            };\r\n" + 
			"\r\n" + 
			"            xhttp.open(\"POST\", \"Your Rest URL Here\", false);\r\n" + 
			"            xhttp.setRequestHeader(\"Content-type\", \"multipart/form-data\");\r\n" + 
			"            xhttp.setRequestHeader('Authorization', 'Basic ' + window.btoa('apiusername:apiuserpassword'));\r\n" + 
			"            xhttp.send();\r\n" + 
			"            var response = JSON.parse(xhttp.responseText);*/\r\n" + 
			"\r\n" + 
			"            //document.getElementById(\"success-content\").innerHTML = xmlhttp.statusText + \":\" + xmlhttp.status + \"<BR><textarea rows='100' cols='100'>\" + xmlhttp.responseText + \"</textarea>\";\r\n" + 
			"        }\r\n" + 
			"\r\n" + 
			"        </script>\r\n" + 
			"\r\n" + 
			"        <style>\r\n" + 
			"            body {\r\n" + 
			"                padding-top: 70px;\r\n" + 
			"            }\r\n" + 
			"\r\n" + 
			"            .imageupload {\r\n" + 
			"                margin: 20px 0;\r\n" + 
			"            }\r\n" + 
			"        </style>\r\n" + 
			"\r\n" + 
			"    </head>\r\n" + 
			"\r\n" + 
			"    <body>\r\n" + 
			"\r\n" + 
			"        <nav class=\"navbar navbar-inverse navbar-fixed-top\">\r\n" + 
			"            <div class=\"container\">\r\n" + 
			"                <div class=\"navbar-header\">\r\n" + 
			"                    <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\r\n" + 
			"                        <span class=\"icon-bar\"></span>\r\n" + 
			"                        <span class=\"icon-bar\"></span>\r\n" + 
			"                        <span class=\"icon-bar\"></span>\r\n" + 
			"                    </button>\r\n" + 
			"                    <a class=\"navbar-brand\" href=\"\">Equation Solver as a Service</a>\r\n" + 
			"                </div>\r\n" + 
			"                <div class=\"collapse navbar-collapse\">\r\n" + 
			"                    <ul class=\"nav navbar-nav\">\r\n" + 
			"                        <li class=\"active\">\r\n" + 
			"                            <a href=\"\">Demo</a>\r\n" + 
			"                        </li>\r\n" + 
			"                        <li>\r\n" + 
			"                            <a href=\"http://www.example.com\">About Us</a>\r\n" + 
			"                        </li>\r\n" + 
			"                    </ul>\r\n" + 
			"                </div>\r\n" + 
			"            </div>\r\n" + 
			"        </nav>\r\n" + 
			"\r\n" + 
			"        <div class=\"container\">\r\n" + 
			"\r\n" + 
			"            <h4><p>Please upload the image of the equation you want to solve.</p></h4>\r\n" + 
			"\r\n" + 
			"            <form id=\"data\" name=\"data\" method=\"post\" enctype=\"multipart/form-data\" action=\"http://localhost:8080/solve\">\r\n" + 
			"            <!-- bootstrap-imageupload. -->\r\n" + 
			"            <div class=\"imageupload panel panel-default\">\r\n" + 
			"                <div class=\"panel-heading clearfix\">\r\n" + 
			"                    <h3 class=\"panel-title pull-left\">Upload Image</h3>\r\n" + 
			"                    <div class=\"btn-group pull-right\">\r\n" + 
			"                        <button type=\"button\" class=\"btn btn-default active\">File</button>\r\n" + 
			"                        <button type=\"button\" class=\"btn btn-default\">URL</button>\r\n" + 
			"                    </div>\r\n" + 
			"                </div>\r\n" + 
			"                <div class=\"file-tab panel-body\">\r\n" + 
			"                    <label class=\"btn btn-default btn-file\">\r\n" + 
			"                        <span>Browse</span>\r\n" + 
			"                        <!-- The file is stored here. -->\r\n" + 
			"                        <input type=\"file\" name=\"file\" id=\"file\">\r\n" + 
			"                    </label>\r\n" + 
			"                    <button type=\"button\" class=\"btn btn-default\">Remove</button>\r\n" + 
			"                </div>\r\n" + 
			"                <div class=\"url-tab panel-body\">\r\n" + 
			"                    <div class=\"input-group\">\r\n" + 
			"                        <input type=\"text\" class=\"form-control hasclear\" placeholder=\"Image URL\">\r\n" + 
			"                        <div class=\"input-group-btn\">\r\n" + 
			"                            <button type=\"button\" class=\"btn btn-default\">Submit</button>\r\n" + 
			"                        </div>\r\n" + 
			"                    </div>\r\n" + 
			"                    <button type=\"button\" class=\"btn btn-default\">Remove</button>\r\n" + 
			"                    <!-- The URL is stored here. -->\r\n" + 
			"                    <input type=\"hidden\" name=\"image-url\">\r\n" + 
			"                </div>\r\n" + 
			"            </div>\r\n" + 
			"\r\n" + 
			"            <div class=\"container\">\r\n" + 
			"                <div class=\"panel-group\">\r\n" + 
			"                    <div class=\"panel panel-success\" id=\"panel-success\">\r\n" + 
			"                        <div class=\"panel-heading\">Success! The solution to your equation is : </div>\r\n" + 
			"                        <div class=\"panel-body\" id=\"success-content\"><h3>";
	
	static String html2="</h3></div>\r\n" + 
			"                    </div>\r\n" + 
			"\r\n" + 
			"                    <div class=\"panel panel-warning\" id=\"panel-warning\">\r\n" + 
			"                        <div class=\"panel-heading\">Panel with panel-warning class</div>\r\n" + 
			"                        <div class=\"panel-body\">Panel Content</div>\r\n" + 
			"                    </div>\r\n" + 
			"\r\n" + 
			"                    <div class=\"panel panel-danger\" id=\"panel-danger\">\r\n" + 
			"                        <div class=\"panel-heading\">Error! The following error occured while evaluating the equation : </div>\r\n" + 
			"                        <div class=\"panel-body\" id=\"danger-content\">Panel Content</div>\r\n" + 
			"                    </div>\r\n" + 
			"                \r\n" + 
			"                </div>\r\n" + 
			"            </div>\r\n" + 
			"\r\n" + 
			"            <!-- bootstrap-imageupload method buttons. -->\r\n" + 
			"            <button type=\"submit\" class=\"btn btn-primary\" >Submit</button>\r\n" + 
			"            <button type=\"button\" id=\"imageupload-disable\" class=\"btn btn-danger\">Disable</button>\r\n" + 
			"            <button type=\"button\" id=\"imageupload-enable\" class=\"btn btn-success\">Enable</button>\r\n" + 
			"            <button type=\"button\" id=\"imageupload-reset\" class=\"btn btn-primary\">Reset</button>\r\n" + 
			"            </form>\r\n" + 
			"\r\n" + 
			"\r\n" + 
			"        </div>\r\n" + 
			"\r\n" + 
			"        <!--<script src=\"https://code.jquery.com/jquery-1.12.4.min.js\" integrity=\"sha256-ZosEbRLbNQzLpnKIkEdrPv7lOy9C27hHQ+Xp8a4MxAQ=\"crossorigin=\"anonymous\"></script>-->\r\n" + 
			"        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\" crossorigin=\"anonymous\"></script>\r\n" + 
			"        <script>if (typeof jQuery === 'undefined') {\r\n" + 
			"    throw new Error('bootstrap-imageupload\\'s JavaScript requires jQuery.');\r\n" + 
			"}\r\n" + 
			"\r\n" + 
			"(function($) {\r\n" + 
			"    'use strict';\r\n" + 
			"\r\n" + 
			"    var options = {};\r\n" + 
			"\r\n" + 
			"    var methods = {\r\n" + 
			"        init: init,\r\n" + 
			"        disable: disable,\r\n" + 
			"        enable: enable,\r\n" + 
			"        reset: reset\r\n" + 
			"    };\r\n" + 
			"\r\n" + 
			"    // -----------------------------------------------------------------------------\r\n" + 
			"    // Plugin Definition\r\n" + 
			"    // -----------------------------------------------------------------------------\r\n" + 
			"\r\n" + 
			"    $.fn.imageupload = function(methodOrOptions) {\r\n" + 
			"        var givenArguments = arguments;\r\n" + 
			"\r\n" + 
			"        return this.filter('div').each(function() {\r\n" + 
			"            if (methods[methodOrOptions]) {\r\n" + 
			"                methods[methodOrOptions].apply($(this), Array.prototype.slice.call(givenArguments, 1));\r\n" + 
			"            }\r\n" + 
			"            else if (typeof methodOrOptions === 'object' || !methodOrOptions) {\r\n" + 
			"                methods.init.apply($(this), givenArguments);\r\n" + 
			"            }\r\n" + 
			"            else {\r\n" + 
			"                throw new Error('Method \"' + methodOrOptions + '\" is not defined for imageupload.');\r\n" + 
			"            }\r\n" + 
			"        });\r\n" + 
			"    };\r\n" + 
			"\r\n" + 
			"    $.fn.imageupload.defaultOptions = {\r\n" + 
			"        allowedFormats: [ 'jpg', 'jpeg', 'png', 'gif' ],\r\n" + 
			"        maxWidth: 250,\r\n" + 
			"        maxHeight: 250,\r\n" + 
			"        maxFileSizeKb: 2048\r\n" + 
			"    };\r\n" + 
			"\r\n" + 
			"    // -----------------------------------------------------------------------------\r\n" + 
			"    // Public Methods\r\n" + 
			"    // -----------------------------------------------------------------------------\r\n" + 
			"\r\n" + 
			"    function init(givenOptions) {\r\n" + 
			"        options = $.extend({}, $.fn.imageupload.defaultOptions, givenOptions);\r\n" + 
			"\r\n" + 
			"        var $imageupload = this;\r\n" + 
			"        var $fileTab = $imageupload.find('.file-tab');\r\n" + 
			"        var $fileTabButton = $imageupload.find('.panel-heading .btn:eq(0)');\r\n" + 
			"        var $browseFileButton = $fileTab.find('input[type=\"file\"]');\r\n" + 
			"        var $removeFileButton = $fileTab.find('.btn:eq(1)');\r\n" + 
			"        var $urlTab = $imageupload.find('.url-tab');\r\n" + 
			"        var $urlTabButton = $imageupload.find('.panel-heading .btn:eq(1)');\r\n" + 
			"        var $submitUrlButton = $urlTab.find('.btn:eq(0)');\r\n" + 
			"        var $removeUrlButton = $urlTab.find('.btn:eq(1)');\r\n" + 
			"\r\n" + 
			"        // Do a complete reset.\r\n" + 
			"        resetFileTab($fileTab);\r\n" + 
			"        resetUrlTab($urlTab);\r\n" + 
			"        showFileTab($fileTab);\r\n" + 
			"        enable.call($imageupload);\r\n" + 
			"        \r\n" + 
			"        // Unbind all previous bound event handlers.\r\n" + 
			"        $fileTabButton.off();\r\n" + 
			"        $browseFileButton.off();\r\n" + 
			"        $removeFileButton.off();\r\n" + 
			"        $urlTabButton.off();\r\n" + 
			"        $submitUrlButton.off();\r\n" + 
			"        $removeUrlButton.off();\r\n" + 
			"\r\n" + 
			"        $fileTabButton.on('click', function() {\r\n" + 
			"            $(this).blur();\r\n" + 
			"            showFileTab($fileTab);\r\n" + 
			"        });\r\n" + 
			"\r\n" + 
			"        $browseFileButton.on('change', function() {\r\n" + 
			"            $(this).blur();\r\n" + 
			"            submitImageFile($fileTab);\r\n" + 
			"        });\r\n" + 
			"\r\n" + 
			"        $removeFileButton.on('click', function() {\r\n" + 
			"            $(this).blur();\r\n" + 
			"            resetFileTab($fileTab);\r\n" + 
			"        });\r\n" + 
			"\r\n" + 
			"        $urlTabButton.on('click', function() {\r\n" + 
			"            $(this).blur();\r\n" + 
			"            showUrlTab($urlTab);\r\n" + 
			"        });\r\n" + 
			"\r\n" + 
			"        $submitUrlButton.on('click', function() {\r\n" + 
			"            $(this).blur();\r\n" + 
			"            submitImageUrl($urlTab);\r\n" + 
			"        });\r\n" + 
			"\r\n" + 
			"        $removeUrlButton.on('click', function() {\r\n" + 
			"            $(this).blur();\r\n" + 
			"            resetUrlTab($urlTab);\r\n" + 
			"        });\r\n" + 
			"    }\r\n" + 
			"\r\n" + 
			"    function disable() {\r\n" + 
			"        var $imageupload = this;\r\n" + 
			"        $imageupload.addClass('imageupload-disabled');\r\n" + 
			"    }\r\n" + 
			"\r\n" + 
			"    function enable() {\r\n" + 
			"        var $imageupload = this;\r\n" + 
			"        $imageupload.removeClass('imageupload-disabled');\r\n" + 
			"    }\r\n" + 
			"\r\n" + 
			"    function reset() {\r\n" + 
			"        var $imageupload = this;\r\n" + 
			"        init.call($imageupload, options);\r\n" + 
			"    }\r\n" + 
			"\r\n" + 
			"    // -----------------------------------------------------------------------------\r\n" + 
			"    // Private Methods\r\n" + 
			"    // -----------------------------------------------------------------------------\r\n" + 
			"\r\n" + 
			"    function getAlertHtml(message) {\r\n" + 
			"        var html = [];\r\n" + 
			"        html.push('<div class=\"alert alert-danger alert-dismissible\">');\r\n" + 
			"        html.push('<button type=\"button\" class=\"close\" data-dismiss=\"alert\">');\r\n" + 
			"        html.push('<span>&times;</span>');\r\n" + 
			"        html.push('</button>' + message);\r\n" + 
			"        html.push('</div>');\r\n" + 
			"        return html.join('');\r\n" + 
			"    }\r\n" + 
			"\r\n" + 
			"    function getImageThumbnailHtml(src) {\r\n" + 
			"        return '<img src=\"' + src + '\" alt=\"Image preview\" class=\"thumbnail\" style=\"max-width: ' + options.maxWidth + 'px; max-height: ' + options.maxHeight + 'px\">';\r\n" + 
			"    }\r\n" + 
			"\r\n" + 
			"    function getFileExtension(path) {\r\n" + 
			"        return path.substr(path.lastIndexOf('.') + 1).toLowerCase();\r\n" + 
			"    }\r\n" + 
			"\r\n" + 
			"    function isValidImageFile(file, callback) {\r\n" + 
			"        // Check file size.\r\n" + 
			"        if (file.size / 1024 > options.maxFileSizeKb)\r\n" + 
			"        {\r\n" + 
			"            callback(false, 'File is too large (max ' + options.maxFileSizeKb + 'kB).');\r\n" + 
			"            return;\r\n" + 
			"        }\r\n" + 
			"\r\n" + 
			"        // Check image format by file extension.\r\n" + 
			"        var fileExtension = getFileExtension(file.name);\r\n" + 
			"        if ($.inArray(fileExtension, options.allowedFormats) > -1) {\r\n" + 
			"            callback(true, 'Image file is valid.');\r\n" + 
			"        }\r\n" + 
			"        else {\r\n" + 
			"            callback(false, 'File type is not allowed.');\r\n" + 
			"        }\r\n" + 
			"    }\r\n" + 
			"\r\n" + 
			"    function isValidImageUrl(url, callback) {\r\n" + 
			"        var timer = null;\r\n" + 
			"        var timeoutMs = 3000;\r\n" + 
			"        var timeout = false;\r\n" + 
			"        var image = new Image();\r\n" + 
			"\r\n" + 
			"        image.onload = function() {\r\n" + 
			"            if (!timeout) {\r\n" + 
			"                window.clearTimeout(timer);\r\n" + 
			"\r\n" + 
			"                // Strip querystring (and fragment) from URL.\r\n" + 
			"                var tempUrl = url;\r\n" + 
			"                if (tempUrl.indexOf('?') !== -1) {\r\n" + 
			"                    tempUrl = tempUrl.split('?')[0].split('#')[0];\r\n" + 
			"                }\r\n" + 
			"\r\n" + 
			"                // Check image format by file extension.\r\n" + 
			"                var fileExtension = getFileExtension(tempUrl);\r\n" + 
			"                if ($.inArray(fileExtension, options.allowedFormats) > -1) {\r\n" + 
			"                    callback(true, 'Image URL is valid.');\r\n" + 
			"                }\r\n" + 
			"                else {\r\n" + 
			"                    callback(false, 'File type is not allowed.');\r\n" + 
			"                }\r\n" + 
			"            }\r\n" + 
			"        };\r\n" + 
			"\r\n" + 
			"        image.onerror = function() {\r\n" + 
			"            if (!timeout) {\r\n" + 
			"                window.clearTimeout(timer);\r\n" + 
			"                callback(false, 'Image could not be found.');\r\n" + 
			"            }\r\n" + 
			"        };\r\n" + 
			"\r\n" + 
			"        image.src = url;\r\n" + 
			"\r\n" + 
			"        // Abort if image takes longer than 3000ms to load.\r\n" + 
			"        timer = window.setTimeout(function() {\r\n" + 
			"            timeout = true;\r\n" + 
			"            image.src = '???'; // Trigger error to stop loading.\r\n" + 
			"            callback(false, 'Loading image timed out.');\r\n" + 
			"        }, timeoutMs);\r\n" + 
			"    }\r\n" + 
			"\r\n" + 
			"    function showFileTab($fileTab) {\r\n" + 
			"        var $imageupload = $fileTab.closest('.imageupload');\r\n" + 
			"        var $fileTabButton = $imageupload.find('.panel-heading .btn:eq(0)');\r\n" + 
			"\r\n" + 
			"        if (!$fileTabButton.hasClass('active')) {\r\n" + 
			"            var $urlTab = $imageupload.find('.url-tab');\r\n" + 
			"\r\n" + 
			"            // Change active tab buttton.\r\n" + 
			"            $imageupload.find('.panel-heading .btn:eq(1)').removeClass('active');\r\n" + 
			"            $fileTabButton.addClass('active');\r\n" + 
			"\r\n" + 
			"            // Hide URL tab and show file tab.\r\n" + 
			"            $urlTab.hide();\r\n" + 
			"            $fileTab.show();\r\n" + 
			"            resetUrlTab($urlTab);\r\n" + 
			"        }\r\n" + 
			"    }\r\n" + 
			"\r\n" + 
			"    function resetFileTab($fileTab) {\r\n" + 
			"        $fileTab.find('.alert').remove();\r\n" + 
			"        $fileTab.find('img').remove();\r\n" + 
			"        $fileTab.find('.btn span').text('Browse');\r\n" + 
			"        $fileTab.find('.btn:eq(1)').hide();\r\n" + 
			"        $fileTab.find('input').val('');\r\n" + 
			"    }\r\n" + 
			"\r\n" + 
			"    function submitImageFile($fileTab) {\r\n" + 
			"        var $browseFileButton = $fileTab.find('.btn:eq(0)');\r\n" + 
			"        var $removeFileButton = $fileTab.find('.btn:eq(1)');\r\n" + 
			"        var $fileInput = $browseFileButton.find('input');\r\n" + 
			"        \r\n" + 
			"        $fileTab.find('.alert').remove();\r\n" + 
			"        $fileTab.find('img').remove();\r\n" + 
			"        $browseFileButton.find('span').text('Browse');\r\n" + 
			"        $removeFileButton.hide();\r\n" + 
			"\r\n" + 
			"        // Check if file was uploaded.\r\n" + 
			"        if (!($fileInput[0].files && $fileInput[0].files[0])) {\r\n" + 
			"            return;\r\n" + 
			"        }\r\n" + 
			"\r\n" + 
			"        $browseFileButton.prop('disabled', true);\r\n" + 
			"        \r\n" + 
			"        var file = $fileInput[0].files[0];\r\n" + 
			"\r\n" + 
			"        isValidImageFile(file, function(isValid, message) {\r\n" + 
			"            if (isValid) {\r\n" + 
			"                var fileReader = new FileReader();\r\n" + 
			"\r\n" + 
			"                fileReader.onload = function(e) {\r\n" + 
			"                    // Show thumbnail and remove button.\r\n" + 
			"                    $fileTab.prepend(getImageThumbnailHtml(e.target.result));\r\n" + 
			"                    $browseFileButton.find('span').text('Change');\r\n" + 
			"                    $removeFileButton.css('display', 'inline-block');\r\n" + 
			"                };\r\n" + 
			"\r\n" + 
			"                fileReader.onerror = function() {\r\n" + 
			"                    $fileTab.prepend(getAlertHtml('Error loading image file.'));\r\n" + 
			"                    $fileInput.val('');\r\n" + 
			"                };\r\n" + 
			"\r\n" + 
			"                fileReader.readAsDataURL(file);\r\n" + 
			"            }\r\n" + 
			"            else {\r\n" + 
			"                $fileTab.prepend(getAlertHtml(message));\r\n" + 
			"                $browseFileButton.find('span').text('Browse');\r\n" + 
			"                $fileInput.val('');\r\n" + 
			"            }\r\n" + 
			"\r\n" + 
			"            $browseFileButton.prop('disabled', false);\r\n" + 
			"        });\r\n" + 
			"    }\r\n" + 
			"\r\n" + 
			"    function showUrlTab($urlTab) {\r\n" + 
			"        var $imageupload = $urlTab.closest('.imageupload');\r\n" + 
			"        var $urlTabButton = $imageupload.find('.panel-heading .btn:eq(1)');\r\n" + 
			"\r\n" + 
			"        if (!$urlTabButton.hasClass('active')) {\r\n" + 
			"            var $fileTab = $imageupload.find('.file-tab');\r\n" + 
			"\r\n" + 
			"            // Change active tab button.\r\n" + 
			"            $imageupload.find('.panel-heading .btn:eq(0)').removeClass('active');\r\n" + 
			"            $urlTabButton.addClass('active');\r\n" + 
			"\r\n" + 
			"            // Hide file tab and show URL tab.\r\n" + 
			"            $fileTab.hide();\r\n" + 
			"            $urlTab.show();\r\n" + 
			"            resetFileTab($fileTab);\r\n" + 
			"        }\r\n" + 
			"    }\r\n" + 
			"\r\n" + 
			"    function resetUrlTab($urlTab) {\r\n" + 
			"        $urlTab.find('.alert').remove();\r\n" + 
			"        $urlTab.find('img').remove();\r\n" + 
			"        $urlTab.find('.btn:eq(1)').hide();\r\n" + 
			"        $urlTab.find('input').val('');\r\n" + 
			"    }\r\n" + 
			"\r\n" + 
			"    function submitImageUrl($urlTab) {\r\n" + 
			"        var $urlInput = $urlTab.find('input[type=\"text\"]');\r\n" + 
			"        var $submitUrlButton = $urlTab.find('.btn:eq(0)');\r\n" + 
			"        var $removeUrlButton = $urlTab.find('.btn:eq(1)');\r\n" + 
			"\r\n" + 
			"        $urlTab.find('.alert').remove();\r\n" + 
			"        $urlTab.find('img').remove();\r\n" + 
			"        $removeUrlButton.hide();\r\n" + 
			"\r\n" + 
			"        var url = $urlInput.val();\r\n" + 
			"        if (!url) {\r\n" + 
			"            $urlTab.prepend(getAlertHtml('Please enter an image URL.'));\r\n" + 
			"            return;\r\n" + 
			"        }\r\n" + 
			"\r\n" + 
			"        $urlInput.prop('disabled', true);\r\n" + 
			"        $submitUrlButton.prop('disabled', true);\r\n" + 
			"        \r\n" + 
			"        isValidImageUrl(url, function(isValid, message) {\r\n" + 
			"            if (isValid) {\r\n" + 
			"                // Submit URL value.\r\n" + 
			"                $urlTab.find('input[type=\"hidden\"]').val(url);\r\n" + 
			"\r\n" + 
			"                // Show thumbnail and remove button.\r\n" + 
			"                $(getImageThumbnailHtml(url)).insertAfter($submitUrlButton.closest('.input-group'));\r\n" + 
			"                $removeUrlButton.css('display', 'inline-block');\r\n" + 
			"            }\r\n" + 
			"            else {\r\n" + 
			"                $urlTab.prepend(getAlertHtml(message));\r\n" + 
			"            }\r\n" + 
			"\r\n" + 
			"            $urlInput.prop('disabled', false);\r\n" + 
			"            $submitUrlButton.prop('disabled', false);\r\n" + 
			"        });\r\n" + 
			"    }\r\n" + 
			"}(jQuery));\r\n" + 
			"</script>\r\n" + 
			"\r\n" + 
			"        <script>\r\n" + 
			"            /*$(\"#data\").submit(function(e) {\r\n" + 
			"\r\n" + 
			"            //alert(\"Got called!\");\r\n" + 
			"            e.preventDefault();    \r\n" + 
			"            var formData = new FormData(this);\r\n" + 
			"            //var formData = new FormData($(this)[0]);\r\n" + 
			"            //var formData = $(this).serialize();\r\n" + 
			"            alert(formData);\r\n" + 
			"\r\n" + 
			"            $.ajax({\r\n" + 
			"                url: window.location.pathname,\r\n" + 
			"                type: 'POST',\r\n" + 
			"                data: formData,\r\n" + 
			"                async: false,\r\n" + 
			"                success: function (data) {\r\n" + 
			"                    alert(\"Success!\");\r\n" + 
			"                    SubmitImage(data);\r\n" + 
			"                },\r\n" + 
			"                error: function (data) {\r\n" + 
			"                    alert(\"Failure!\");\r\n" + 
			"                    alert(data);\r\n" + 
			"                    SubmitImage(data);\r\n" + 
			"                },\r\n" + 
			"                cache: false,\r\n" + 
			"                contentType: 'multipart/form-data',\r\n" + 
			"                processData: false\r\n" + 
			"            });\r\n" + 
			"            });*/\r\n" + 
			"\r\n" + 
			"\r\n" + 
			"\r\n" + 
			"            var $imageupload = $('.imageupload');\r\n" + 
			"            $imageupload.imageupload();\r\n" + 
			"\r\n" + 
			"            $('#imageupload-disable').on('click', function() {\r\n" + 
			"                $imageupload.imageupload('disable');\r\n" + 
			"                $(this).blur();\r\n" + 
			"            })\r\n" + 
			"\r\n" + 
			"            $('#imageupload-enable').on('click', function() {\r\n" + 
			"                $imageupload.imageupload('enable');\r\n" + 
			"                $(this).blur();\r\n" + 
			"            })\r\n" + 
			"\r\n" + 
			"            $('#imageupload-reset').on('click', function() {\r\n" + 
			"                $imageupload.imageupload('reset');\r\n" + 
			"                $(this).blur();\r\n" + 
			"            });\r\n" + 
			"\r\n" + 
			
			"\r\n" + 
			"            var x = document.getElementById(\"panel-warning\");\r\n" + 
			"            x.style.display = \"none\";\r\n" + 
			"\r\n" + 
			"            var x = document.getElementById(\"panel-danger\");\r\n" + 
			"            x.style.display = \"none\";\r\n" + 
			"\r\n" + 
			"        </script>\r\n" + 
			"\r\n" + 
			"    </body>\r\n" + 
			"\r\n" + 
			"</html>\r\n" + 
			"";

}
