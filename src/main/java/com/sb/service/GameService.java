package com.sb.service;

import com.sb.game.Die;
import com.sb.game.GameServiceGrpc;
import com.sb.game.GameState;
import io.grpc.stub.StreamObserver;

public class GameService extends GameServiceGrpc.GameServiceImplBase {
    @Override
    public StreamObserver<Die> roll(StreamObserver<GameState> responseObserver) {
        return super.roll(responseObserver);
    }
}
