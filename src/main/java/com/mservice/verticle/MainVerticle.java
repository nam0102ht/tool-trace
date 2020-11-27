package com.mservice.verticle;

import com.mservice.gen.CatLogGrpc;
import com.mservice.gen.Command;
import com.mservice.gen.Log;
import com.mservice.main.MyInterceptor;
import com.mservice.main.SshUtils;
import com.mservice.service.CommandService;
import io.grpc.ServerInterceptor;
import io.grpc.ServerInterceptors;
import io.vertx.core.*;
import io.vertx.grpc.*;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class MainVerticle extends AbstractVerticle {
    private CommandService commandService;

    @Override
    public void start(Promise<Void> startPromise) throws Exception {
        MyInterceptor myInterceptor = new MyInterceptor();
        ServerInterceptor wrapped = BlockingServerInterceptor.wrap(vertx, myInterceptor);

        // Create the server
        VertxServer rpcServer = VertxServerBuilder
                .forAddress(vertx, "localhost", 50055)
                .addService(ServerInterceptors.intercept(new CatLogGrpc.CatLogVertxImplBase() {
                    @Override
                    public void command148(Command request, GrpcWriteStream<Log> response) {
                        commandService.command148(request, response);
                    }

                    @Override
                    public void command218(Command request, GrpcWriteStream<Log> response) {
                        commandService.command218(request, response);
                    }

                    @Override
                    public void command232(Command request, GrpcWriteStream<Log> response) {
                        commandService.command232(request, response);
                    }

                    @Override
                    public void command108(Command request, GrpcWriteStream<Log> response) {
                        commandService.command108(request, response);
                    }

                    @Override
                    public void command102(Command request, GrpcWriteStream<Log> response) {
                        commandService.command102(request, response);
                    }

                    @Override
                    public void command12(Command request, GrpcWriteStream<Log> response) {
                        commandService.command12(request, response);
                    }
                }, wrapped))
                .build();

        // Start it
        rpcServer.start(handler -> {
            if(handler.succeeded()) {
                log.info("GRPC is initial successed");
                return;
            }
            log.error("GRPC can not initial successed: "+handler.cause().getCause());
        });
    }

    @Override
    public void stop(Promise<Void> stopPromise) throws Exception {

    }

    public static void main(String[] args) {
        Vertx v = Vertx.vertx(new VertxOptions().setPreferNativeTransport(true));
        log.info("----------------START-GRPC----------------");
        log.info("|          () ()     /)/)    (|(|        |");
        log.info("|          (^.^)    ( @.@)   (o.o)       |");
        log.info("|                                        |");
        log.info("------------------------------------------");
        //log.info(SshUtils.shellHoldConnect("root", "P@ssword", "172.16.13.12", "tail -f /app/backend_v2/logs/service.log"));
        // log.info(SshUtils.shellHasUser("root", "P@ssword", "172.16.13.12", "cat /app/backend_v2/logs/service.log"));
        v.deployVerticle(new MainVerticle());
    }
}
