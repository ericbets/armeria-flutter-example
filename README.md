# Armeria flutter example

This repo houses a flutter project that uses grpc-web to talk to an armeria server using flutter-web. The project is now working using the flutter_cors tool. https://pub.dev/packages/flutter_cors

The directories are:

- grpc/ is the grpc server taken from the armeria examples.
- grpc-dart/ to regenerate the dart code in grpc-dart/examples/helloworld (unneeded here included only for completeness)
- flutterproj/ to run the flutter client

Things tried:
 - Adding a CORS decorator
 - Various url schemes, eg. gproto-web+http://127.0.0.1:8282


