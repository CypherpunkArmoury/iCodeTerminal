interface Demo {
  sayHello(name: String, onSuccess: (res: String) => void, onFail: () => object): void;
}

declare var demo: Demo;