<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>定时任务管理</title>
    <link rel="stylesheet" type="text/css" href="/easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="/easyui/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="/css/index.css">
    <script type="text/javascript" src="/easyui/jquery.min.js"></script>
    <script type="text/javascript" src="/easyui/jquery.easyui.min.js"></script>
    <style>
        .pad10 {
            padding: 30px;
        }

        table, tr, td, th {
            border: 1px solid;
            border-collapse: collapse;
        }

        td, th {
            text-align: center;
        }

        .running, .autoStartup {
            background-color: #00ee00;
        }

        .optBtn {
            cursor: pointer;
            text-decoration: underline;
            color: blue;
        }

        .odd {
            background-color: #ffe48d;
        }
    </style>
</head>
<body>
<div style="margin: 0 auto">
    <table title="定时任务管理">
        <thead>
        <tr>
            <th>schedulerName</th>
            <th style="width: 400px">描述</th>
            <th style="width: 80px">cronExpression</th>
            <th style="width: 100px">正在运行?</th>
            <th style="width: 100px">自启动?</th>
            <th style="width: 200px">操作</th>
        </tr>
        </thead>
        <tbody>

        <#list taskList as task>
        <tr>
            <td class="pad10">${task.schedulerName}</td>
            <td>${task.desc}</td>
            <td>${task.cronExpression}</td>
            <td class="${task.running?string('running','')}">${task.running?c}</td>
            <td class="${task.autoStartup?string('autoStartup','')}">${task.autoStartup?c}</td>
            <td>
                <a class="optBtn"
                   onclick="startOrStopTask('${task.schedulerName}',${task.running?c})">
                    ${task.running?string('停止','启动')}
                </a>&nbsp;&nbsp;
                <a class="optBtn" onclick="runOnce('${task.schedulerName}')">执行一次</a>
            </td>
        </tr>
        </#list>
        <tr>
            <td colspan="6" style="text-align: center">
                <a class="optBtn" onclick="startAll()">启动所用任务</a>&nbsp;&nbsp;
                <a class="optBtn" onclick="stopAll()">停止所有任务</a>
            </td>
        </tr>
        </tbody>
    </table>
</div>

<script type="text/javascript">
    var startAll = function () {
        $.get('/timeTask/startAll', function (data) {
            if (data.success) {
                alert('执行成功');
            } else {
                alert('执行失败');
            }
            reloadPage();
        }).fail(function () {
            alert('执行失败');
            reloadPage();
        });
    };
    var stopAll = function () {
        $.get('/timeTask/stopAll', function (data) {
            if (data.success) {
                alert('执行成功');
            } else {
                alert('执行失败');
            }
            reloadPage();
        }).fail(function () {
            alert('执行失败');
            reloadPage();
        });
    };
    var reloadPage = function () {
        window.location.reload();
    };

    var startOrStopTask = function (schedulerName, isRunning) {
        if (isRunning) {
            stopTask(schedulerName);
        } else {
            startTask(schedulerName);
        }
    };

    var startTask = function (schedulerName) {
        $.post('/timeTask/start', {
            'schedulerName': schedulerName
        }, function (data) {
            if (data.success) {
                alert('执行成功');
            } else {
                alert('执行失败');
            }
            reloadPage();
        }, 'json').fail(function () {
            alert('执行失败');
            reloadPage();
        });
    };
    var stopTask = function (schedulerName) {
        $.post('/timeTask/stop', {
            'schedulerName': schedulerName
        }, function (data) {
            if (data.success) {
                alert('执行成功');
            } else {
                alert('执行失败');
            }
            reloadPage();
        }, 'json').fail(function () {
            alert('执行失败');
            reloadPage();
        });
    };
    var runOnce = function (schedulerName) {
        $.post('/timeTask/runOnce', {
            'schedulerName': schedulerName
        }, function (data) {
            if (data.success) {
                alert('执行成功');
            } else {
                alert('执行失败');
            }
            reloadPage();
        }, 'json').fail(function () {
            alert('执行失败');
            reloadPage();
        });
    }
</script>

</body>
</html>