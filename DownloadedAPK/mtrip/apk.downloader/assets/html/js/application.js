function loadAppList() {
	var jsonList = Android.getJsonAppList();
	var appList = [];
	if (jsonList != "") {
		appList = JSON.parse(jsonList);
	}

	for (var i = 0; i < appList.length; i++) {
		var app = appList[i];
		var appHtml = $("#app-template").clone();
		// Update image
		appHtml.find(".image").attr("src", app.image);
		appHtml.find(".image-link").attr("href", "market://details?id=" + app.name);
		appHtml.find(".title").html(app.title);
		appHtml.find(".subtitle").html(app.sub_title);
		appHtml.find(".price").html(app.price);
		appHtml.find(".current-rating").css("width", (app.rate * 100/5).toString() + "%");
		appHtml.find(".reviewers-count").html(app.rate_count);
		appHtml.find(".download").attr("id", app.name);
		
		$("#list-apps").append(appHtml);
		appHtml.find(".download").click(function() {
			Android.downloadApk(this.id);
		});
	}
	
	if (!Android.isResultCompleted()) {
		$("#next-result").show();
	} else {
		$("#next-result").hide();
	}
	
	if ($("#list-apps").children().length == 0) {
		$("#guide").show();
	} else {
		$("#guide").hide();
	}
	$("#list-apps").show();
}

function resetAppList() {
	$("#list-apps").html("");
}

function showLoadingIcon(show) {
	if (show) {
		// Hide all, only show loading icon
		$("#guide").hide();
		$("#next-result").hide();
		$("#list-apps").hide();
		$("#loading").show();
	} else {
		$("#loading").hide();
	}
}

function showSpiningOnButton(show) {
	if (show) {
		$("#next-text").html("Loading...");
	} else {
		$("#next-text").html("Next");
	}
}

