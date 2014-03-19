#! /bin/bash

pushd `dirname $0` > /dev/null

ROOTD=`pwd`

find $ROOTD -name "*.iml" -exec rm -rf {} \; &> /dev/null
find $ROOTD -name "\.idea" -exec rm -rf {} \; &> /dev/null
find $ROOTD -name "\.gradle" -exec rm -rf {} \; &> /dev/null

popd
