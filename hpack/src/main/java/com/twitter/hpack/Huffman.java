/*
 * Copyright 2022 http4s.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * Copyright 2014 Twitter, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.twitter.hpack;

import static com.twitter.hpack.HpackUtil.HUFFMAN_CODE_LENGTHS;
import static com.twitter.hpack.HpackUtil.HUFFMAN_CODES;

public final class Huffman {

  /**
   * Huffman Decoder
   */
  public static final HuffmanDecoder DECODER = new HuffmanDecoder(HUFFMAN_CODES, HUFFMAN_CODE_LENGTHS);

  /**
   * Huffman Encoder
   */
  public static final HuffmanEncoder ENCODER = new HuffmanEncoder(HUFFMAN_CODES, HUFFMAN_CODE_LENGTHS);

  private Huffman() {
    // utility class
  }
}
