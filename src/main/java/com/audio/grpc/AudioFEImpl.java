package com.audio.grpc;

import io.grpc.stub.StreamObserver;

public class AudioFEImpl extends AudioFEGrpc.AudioFEImplBase {
    @Override
    public void getFeature(AudioFEOuterClass.Feature request,
                           StreamObserver<AudioFEOuterClass.Feature> responseObserver) {
        // HelloRequest has toString auto-generated.
        System.out.println(request);

        // You must use a builder to construct a new Protobuffer object
        AudioFEOuterClass.Feature response = AudioFEOuterClass.Feature.newBuilder()
                .setValue("Success")
                .build();

        // Use responseObserver to send a single response back
        responseObserver.onNext(response);

        // When you are done, you must call onCompleted.
        responseObserver.onCompleted();

    }

}