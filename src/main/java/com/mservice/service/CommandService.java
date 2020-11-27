package com.mservice.service;

import com.mservice.gen.Command;
import com.mservice.gen.Log;
import com.mservice.main.SshUtils;
import io.vertx.grpc.GrpcWriteStream;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class CommandService {
    // FORM command cat cat:789812821 || tail:7y123213 || zcat:723123:2020-10-11
    private static final String SSH_TERMINAL = "ssh://toan.dang:000000@10.20.16.17";
    private static final String USERNAME12 = "root";
    private static final String PASSWORD12 = "P@ssword";
    private static final String HOST12 = "172.16.13.12";
    private static final String HOST148 = "ssh://toan.dang:momo123@172.16.14.148";
    private static final String HOST232 = "ssh://toan.dang:momo123@172.16.14.232";
    private static final String HOST102 = "ssh://toan.dang:momo123@172.16.14.102";
    private static final String HOST218 = "ssh://toan.dang:momo123@172.16.14.218";
    private static final String HOST108 = "ssh://toan.dang:momo123@172.16.14.108";

    private static final String COMMAND_CAT = "cat app/backend_v2/backend-service/logs/service.log | grep ";
    private static final String COMMAND_CAT_ZIP = "zcat app/backend_v2/backend-service/logs/service";
    private static final String COMMAND_TAIL = "tail app/backend_v2/backend-service/logs/service.log | grep ";

    public static CommandService INSTANCE;

    public CommandService() {}

    public static CommandService GET_INSTANCE() {
        if(INSTANCE == null) INSTANCE = new CommandService();
        return INSTANCE;
    }

    public void command148(Command request, GrpcWriteStream<Log> response) {
        String cmd = request.getCommand();
        String[] splits = cmd.split(":");
        String type = splits[0];
        String transId = splits[1];
        String date = splits[2];
        String command = "";
        if(type=="cat") {
            command = COMMAND_CAT + transId;
            String str = SshUtils.shell(HOST148, command);
            response.write(Log.newBuilder().setLog(str).build());
        } else if(type == "tail") {
            command = COMMAND_TAIL + transId;
            String str = SshUtils.execTail(HOST148, command);
            response.write(Log.newBuilder().setLog(str).build());
        } else if (type == "zcat") {
            command = COMMAND_CAT_ZIP +date+".log.zip"+ " | grep" +transId;
            String str = SshUtils.shell(HOST148, command);
            response.write(Log.newBuilder().setLog(str).build());
        }
    }

    public void command12(Command request, GrpcWriteStream<Log> response) {
        String cmd = request.getCommand();
        String[] splits = cmd.split(":");
        String type = splits[0];
        String transId = splits[1];
        String date = splits[2];
        String command = "";
        if(type=="cat") {
            command = COMMAND_CAT + transId;
            String str = SshUtils.shellHasUser(USERNAME12, PASSWORD12, HOST12, command);
            response.write(Log.newBuilder().setLog(str).build());
        } else if(type == "tail") {
            command = COMMAND_TAIL + transId;
            String str = SshUtils.shellHoldConnect(USERNAME12, PASSWORD12, HOST12, command);
            response.write(Log.newBuilder().setLog(str).build());
        } else if (type == "zcat") {
            command = COMMAND_CAT_ZIP +date+".log.zip"+ " | grep" +transId;
            String str = SshUtils.shellHasUser(USERNAME12, PASSWORD12, HOST12, command);
            response.write(Log.newBuilder().setLog(str).build());
        }
    }

    public void command108(Command request, GrpcWriteStream<Log> response) {
        String cmd = request.getCommand();
        String[] splits = cmd.split(":");
        String type = splits[0];
        String transId = splits[1];
        String date = splits[2];
        String command = "";
        if(type=="cat") {
            command = COMMAND_CAT + transId;
            String str = SshUtils.shell(HOST108, command);
            response.write(Log.newBuilder().setLog(str).build());
        } else if(type == "tail") {
            command = COMMAND_TAIL + transId;
            String str = SshUtils.execTail(HOST108, command);
            response.write(Log.newBuilder().setLog(str).build());
        } else if (type == "zcat") {
            command = COMMAND_CAT_ZIP +date+".log.zip"+ " | grep" +transId;
            String str = SshUtils.shell(HOST108, command);
            response.write(Log.newBuilder().setLog(str).build());
        }
    }

    public void command102(Command request, GrpcWriteStream<Log> response) {
        String cmd = request.getCommand();
        String[] splits = cmd.split(":");
        String type = splits[0];
        String transId = splits[1];
        String date = splits[2];
        String command = "";
        if(type=="cat") {
            command = COMMAND_CAT + transId;
            String str = SshUtils.shell(HOST102, command);
            response.write(Log.newBuilder().setLog(str).build());
        } else if(type == "tail") {
            command = COMMAND_TAIL + transId;
            String str = SshUtils.execTail(HOST102, command);
            response.write(Log.newBuilder().setLog(str).build());
        } else if (type == "zcat") {
            command = COMMAND_CAT_ZIP +date+".log.zip"+ " | grep" +transId;
            String str = SshUtils.shell(HOST102, command);
            response.write(Log.newBuilder().setLog(str).build());
        }
    }

    public void command232(Command request, GrpcWriteStream<Log> response) {
        String cmd = request.getCommand();
        String[] splits = cmd.split(":");
        String type = splits[0];
        String transId = splits[1];
        String date = splits[2];
        String command = "";
        if(type=="cat") {
            command = COMMAND_CAT + transId;
            String str = SshUtils.shell(HOST232, command);
            response.write(Log.newBuilder().setLog(str).build());
        } else if(type == "tail") {
            command = COMMAND_TAIL + transId;
            String str = SshUtils.execTail(HOST232, command);
            response.write(Log.newBuilder().setLog(str).build());
        } else if (type == "zcat") {
            command = COMMAND_CAT_ZIP +date+".log.zip"+ " | grep" +transId;
            String str = SshUtils.shell(HOST232, command);
            response.write(Log.newBuilder().setLog(str).build());
        }
    }

    public void command218(Command request, GrpcWriteStream<Log> response) {
        String cmd = request.getCommand();
        String[] splits = cmd.split(":");
        String type = splits[0];
        String transId = splits[1];
        String date = splits[2];
        String command = "";
        if(type=="cat") {
            command = COMMAND_CAT + transId;
            String str = SshUtils.shell(HOST218, command);
            response.write(Log.newBuilder().setLog(str).build());
        } else if(type == "tail") {
            command = COMMAND_TAIL + transId;
            String str = SshUtils.execTail(HOST218, command);
            response.write(Log.newBuilder().setLog(str).build());
        } else if (type == "zcat") {
            command = COMMAND_CAT_ZIP +date+".log.zip"+ " | grep" +transId;
            String str = SshUtils.shell(HOST218, command);
            response.write(Log.newBuilder().setLog(str).build());
        }
    }

}
