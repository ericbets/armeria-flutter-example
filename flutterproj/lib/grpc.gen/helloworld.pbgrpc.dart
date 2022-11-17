///
//  Generated code. Do not modify.
//  source: helloworld.proto
//
// @dart = 2.12
// ignore_for_file: annotate_overrides,camel_case_types,constant_identifier_names,directives_ordering,library_prefixes,non_constant_identifier_names,prefer_final_fields,return_of_invalid_type,unnecessary_const,unnecessary_import,unnecessary_this,unused_import,unused_shown_name

import 'dart:async' as $async;

import 'dart:core' as $core;

import 'package:grpc/service_api.dart' as $grpc;
import 'helloworld.pb.dart' as $0;
export 'helloworld.pb.dart';

class HelloServiceClient extends $grpc.Client {
  static final _$hello = $grpc.ClientMethod<$0.HelloRequest, $0.HelloReply>(
      '/example.grpc.hello.HelloService/Hello',
      ($0.HelloRequest value) => value.writeToBuffer(),
      ($core.List<$core.int> value) => $0.HelloReply.fromBuffer(value));
  static final _$chello = $grpc.ClientMethod<$0.HelloRequest, $0.HelloReply>(
      '/example.grpc.hello.HelloService/Chello',
      ($0.HelloRequest value) => value.writeToBuffer(),
      ($core.List<$core.int> value) => $0.HelloReply.fromBuffer(value));
  static final _$lazyHello = $grpc.ClientMethod<$0.HelloRequest, $0.HelloReply>(
      '/example.grpc.hello.HelloService/LazyHello',
      ($0.HelloRequest value) => value.writeToBuffer(),
      ($core.List<$core.int> value) => $0.HelloReply.fromBuffer(value));
  static final _$blockingHello =
      $grpc.ClientMethod<$0.HelloRequest, $0.HelloReply>(
          '/example.grpc.hello.HelloService/BlockingHello',
          ($0.HelloRequest value) => value.writeToBuffer(),
          ($core.List<$core.int> value) => $0.HelloReply.fromBuffer(value));
  static final _$lotsOfReplies =
      $grpc.ClientMethod<$0.HelloRequest, $0.HelloReply>(
          '/example.grpc.hello.HelloService/LotsOfReplies',
          ($0.HelloRequest value) => value.writeToBuffer(),
          ($core.List<$core.int> value) => $0.HelloReply.fromBuffer(value));
  static final _$lotsOfGreetings =
      $grpc.ClientMethod<$0.HelloRequest, $0.HelloReply>(
          '/example.grpc.hello.HelloService/LotsOfGreetings',
          ($0.HelloRequest value) => value.writeToBuffer(),
          ($core.List<$core.int> value) => $0.HelloReply.fromBuffer(value));
  static final _$bidiHello = $grpc.ClientMethod<$0.HelloRequest, $0.HelloReply>(
      '/example.grpc.hello.HelloService/BidiHello',
      ($0.HelloRequest value) => value.writeToBuffer(),
      ($core.List<$core.int> value) => $0.HelloReply.fromBuffer(value));

  HelloServiceClient($grpc.ClientChannel channel,
      {$grpc.CallOptions? options,
      $core.Iterable<$grpc.ClientInterceptor>? interceptors})
      : super(channel, options: options, interceptors: interceptors);

  $grpc.ResponseFuture<$0.HelloReply> hello($0.HelloRequest request,
      {$grpc.CallOptions? options}) {
    return $createUnaryCall(_$hello, request, options: options);
  }

  $grpc.ResponseFuture<$0.HelloReply> chello($0.HelloRequest request,
      {$grpc.CallOptions? options}) {
    return $createUnaryCall(_$chello, request, options: options);
  }

  $grpc.ResponseFuture<$0.HelloReply> lazyHello($0.HelloRequest request,
      {$grpc.CallOptions? options}) {
    return $createUnaryCall(_$lazyHello, request, options: options);
  }

  $grpc.ResponseFuture<$0.HelloReply> blockingHello($0.HelloRequest request,
      {$grpc.CallOptions? options}) {
    return $createUnaryCall(_$blockingHello, request, options: options);
  }

  $grpc.ResponseStream<$0.HelloReply> lotsOfReplies($0.HelloRequest request,
      {$grpc.CallOptions? options}) {
    return $createStreamingCall(
        _$lotsOfReplies, $async.Stream.fromIterable([request]),
        options: options);
  }

  $grpc.ResponseFuture<$0.HelloReply> lotsOfGreetings(
      $async.Stream<$0.HelloRequest> request,
      {$grpc.CallOptions? options}) {
    return $createStreamingCall(_$lotsOfGreetings, request, options: options)
        .single;
  }

  $grpc.ResponseStream<$0.HelloReply> bidiHello(
      $async.Stream<$0.HelloRequest> request,
      {$grpc.CallOptions? options}) {
    return $createStreamingCall(_$bidiHello, request, options: options);
  }
}

abstract class HelloServiceBase extends $grpc.Service {
  $core.String get $name => 'example.grpc.hello.HelloService';

  HelloServiceBase() {
    $addMethod($grpc.ServiceMethod<$0.HelloRequest, $0.HelloReply>(
        'Hello',
        hello_Pre,
        false,
        false,
        ($core.List<$core.int> value) => $0.HelloRequest.fromBuffer(value),
        ($0.HelloReply value) => value.writeToBuffer()));
    $addMethod($grpc.ServiceMethod<$0.HelloRequest, $0.HelloReply>(
        'Chello',
        chello_Pre,
        false,
        false,
        ($core.List<$core.int> value) => $0.HelloRequest.fromBuffer(value),
        ($0.HelloReply value) => value.writeToBuffer()));
    $addMethod($grpc.ServiceMethod<$0.HelloRequest, $0.HelloReply>(
        'LazyHello',
        lazyHello_Pre,
        false,
        false,
        ($core.List<$core.int> value) => $0.HelloRequest.fromBuffer(value),
        ($0.HelloReply value) => value.writeToBuffer()));
    $addMethod($grpc.ServiceMethod<$0.HelloRequest, $0.HelloReply>(
        'BlockingHello',
        blockingHello_Pre,
        false,
        false,
        ($core.List<$core.int> value) => $0.HelloRequest.fromBuffer(value),
        ($0.HelloReply value) => value.writeToBuffer()));
    $addMethod($grpc.ServiceMethod<$0.HelloRequest, $0.HelloReply>(
        'LotsOfReplies',
        lotsOfReplies_Pre,
        false,
        true,
        ($core.List<$core.int> value) => $0.HelloRequest.fromBuffer(value),
        ($0.HelloReply value) => value.writeToBuffer()));
    $addMethod($grpc.ServiceMethod<$0.HelloRequest, $0.HelloReply>(
        'LotsOfGreetings',
        lotsOfGreetings,
        true,
        false,
        ($core.List<$core.int> value) => $0.HelloRequest.fromBuffer(value),
        ($0.HelloReply value) => value.writeToBuffer()));
    $addMethod($grpc.ServiceMethod<$0.HelloRequest, $0.HelloReply>(
        'BidiHello',
        bidiHello,
        true,
        true,
        ($core.List<$core.int> value) => $0.HelloRequest.fromBuffer(value),
        ($0.HelloReply value) => value.writeToBuffer()));
  }

  $async.Future<$0.HelloReply> hello_Pre(
      $grpc.ServiceCall call, $async.Future<$0.HelloRequest> request) async {
    return hello(call, await request);
  }

  $async.Future<$0.HelloReply> chello_Pre(
      $grpc.ServiceCall call, $async.Future<$0.HelloRequest> request) async {
    return chello(call, await request);
  }

  $async.Future<$0.HelloReply> lazyHello_Pre(
      $grpc.ServiceCall call, $async.Future<$0.HelloRequest> request) async {
    return lazyHello(call, await request);
  }

  $async.Future<$0.HelloReply> blockingHello_Pre(
      $grpc.ServiceCall call, $async.Future<$0.HelloRequest> request) async {
    return blockingHello(call, await request);
  }

  $async.Stream<$0.HelloReply> lotsOfReplies_Pre(
      $grpc.ServiceCall call, $async.Future<$0.HelloRequest> request) async* {
    yield* lotsOfReplies(call, await request);
  }

  $async.Future<$0.HelloReply> hello(
      $grpc.ServiceCall call, $0.HelloRequest request);
  $async.Future<$0.HelloReply> chello(
      $grpc.ServiceCall call, $0.HelloRequest request);
  $async.Future<$0.HelloReply> lazyHello(
      $grpc.ServiceCall call, $0.HelloRequest request);
  $async.Future<$0.HelloReply> blockingHello(
      $grpc.ServiceCall call, $0.HelloRequest request);
  $async.Stream<$0.HelloReply> lotsOfReplies(
      $grpc.ServiceCall call, $0.HelloRequest request);
  $async.Future<$0.HelloReply> lotsOfGreetings(
      $grpc.ServiceCall call, $async.Stream<$0.HelloRequest> request);
  $async.Stream<$0.HelloReply> bidiHello(
      $grpc.ServiceCall call, $async.Stream<$0.HelloRequest> request);
}
