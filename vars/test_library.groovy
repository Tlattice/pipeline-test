#!/usr/bin/env groovy

def test_call(x) {
    sh 'hello from ${x}'
}
