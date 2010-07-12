/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.oodt.cas.catalog.struct.impl.transaction;

//OODT imports
import org.apache.oodt.cas.catalog.struct.TransactionId;
import org.apache.oodt.cas.catalog.struct.TransactionIdFactory;

/**
 * 
 * Uses a Long representation of the current Time in miliseconds to represent a
 * unique ID.
 * 
 */
public class LongTransactionIdFactory implements TransactionIdFactory {

  public TransactionId<?> createNewTransactionId() {
    return new TransactionId<Long>(System.currentTimeMillis()) {

      @Override
      protected Long fromString(String stringId) {
        return Long.parseLong(stringId);
      }

    };
  }

  public TransactionId<?> createTransactionId(String transactionIdString) {
    return new TransactionId<Long>(transactionIdString) {

      @Override
      protected Long fromString(String stringId) {
        return Long.parseLong(stringId);
      }

    };
  }

}